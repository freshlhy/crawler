package com.weiqingqu;

public class Arrays {
	public static String[] nicknameList = { "mariecat", "大大大大大丽花", "無竟寓", "与我常在", "一一",
			"Lynn", "我不是AMBER", "大M", "沫沫茉", "halo", "呵呵你个厚厚", "命里缺你",
			"5467997", "忧郁的香肠君", "Penny", "Doraemon", "emma", "浮生若梦",
			"123456", "愛酱?", "采菇凉的大蘑菇", "马桶元宵", "酵母君の蛋姬", "迷死鸭鸭", "茶兔小姐",
			"C、", "莫小猪", "活泼少女小S", "夜叉上去恁死他", "小笨笨", "o～dale", "干嘛要说我是谁",
			"Rough", "差一点丑姑娘^", "咚咕隆锵", "长肉君", "鞋舌不跑偏", "小枫子", "寒夜听风",
			"形而上学", "sidle", "大心脏", "好大的天败", "王脆脆", "devil......", "暗号大老爷",
			"专业反水军", "Shall.Y", "mint", "霓裳", "舆醉", "（?﹃?）", "王老邪", "bx",
			"卖报小行家", "shellyshelly", "烟雨溪", "麻薯不单卖", "瓦力酱", "J_冰包子",
			"再傻一回", "大咪", "越作越勇。", "总是看我很面熟", "坐怀不乱西萌庆", "江蓠", "啦啦啦啦啦",
			"小白脸儿", "正版国产女青年", "梦到又怎样", "江家姚。", "墨小墨", "王小猫", "阿勇", "小木棉。",
			"sweet", "wh-ale", "学魔大人", "孩仔", "手撕鲍鱼", "一二", "牛小姐不牛",
			"Vincent .", "暴走的萝莉", "susie wong", "傲娇的吃货", "嗡嗡嗡", "DQ",
			"仙人掌娘娘", "秋本 明", "福尔马帅", "妮可冬", "lilybobi", "呵呵呵", "FigMent",
			"Symi Li", "唐笑离", "Steven Sun", "春天责备杀猪君", "光影离合", "CLORIS",
			"放学后别走！", "faketrees", "男梅藏", "浏海很乱", "汪经理", "慰寂寥",
			"MoNoGlitch?", "冷趴趴趴巫婆", "盐酱", "疏桐", "vision", "nnnnnn", "影君子",
			"Debbie", "好好笑。", "丶午眠", "超级杨可爱~", "第五书墨", "老虎不在家", "D的邪恶双胞胎",
			"倒吊男", "盖世英雄", "DORORO", "CU！", "拿美帝的钱", "不思议", "sphinX", "伊红",
			"suarez", "中二病就是我", "李堀熊", "锵锵锵", "Jess", "熙玛拉雅", "罹水沉香", "gg",
			"秘密", "Lynch", "鄉瓜", "没名字", "匿名网友", "柚子酱", "月狮", "异客",
			"叫我寶哥哥~", "寂寞高手", "假装高中生", "啾啾啾", "哈拉爱梦游", "忧伤海带胖", "墨翌小姐",
			"赵五仁", "siner", "姜喜宝", "莫名觉厉", "?bel.yu?", "我家在村口", "兜兜有糖糖",
			"星辰君JS~", "亨亨", "凝子酱爱吃肉包", "柚子总攻", "梦影雾花尽是空", "Elodia",
			"Anan迷糊M呦", "怂的一逼", "女神进化中", "紅豆布丁_5", "Kssandra", "网络流",
			"Celia", "0000088888", "モニカ", "小铃铛?", "Dove.", "windwish",
			"痞子叔", "tomorrow", "vavava", "匹诺曹小姐", "去屑实力派", "小清腥", "逗逗小姐",
			"cream", "何处笙箫", "你看阳光正好", "浅斟低唱", "一个圈", "组长大人", "银千特",
			"好丑友与好少鱼", "七-20", "春暧便花开", "匹夫之勇", "May", "不甜不甜就不甜",
			"weekend", "卷儿~~", "祝吉祥", "默默的默", "sanders", "大马趴", "Er︿♂",
			"董啊囧是你大爷", "Elena", "太淘气了", "安心", "澄澄澄澄澄", "剪刀手肖申克", "KIKI阿基拉",
			"肚腩仔", "downy flake", "闹不闹得住都闹", "王思蒜", "爱吃葡萄不吐皮", "A.Sue",
			"大白免奶糖", "流年", "Fun", "步步生莲", "Crush U", "长剑在手", "优乐美",
			"mikaze", "Fontaine", "猫猫", "诗意的疯子", "Julia", "满脸挂饭盒", "蛋蛋",
			"噼里啪啦", "啊喂", "不高兴。", "NISO", "老兜", "無空", "發財妹", "浮生",
			"tata12310", "陆嗜酒", "AlfaBeta", "小肥肥", "睡王子", "吴吴呜呜", "CLOWN",
			"58Wang明明", "羊肉小花卷", "青骓", "我走啊走", "小鹿拔足狂奔丶", "寻常", "miya",
			"过期少女mimiko", "胡小七", "李小夜夜", "Sway", "dearYeunG", "oxygen",
			"阿树", "李布丁", "喵喵小姐很黏人", "本能难赦", "Alice", "阿怪。", "周_xiao", "萌呆",
			"无爱病人", "猫爱吃鱼", "April", "Monica", "饭饭", "纳尼加豆", "猞猁子",
			"灵活的胖子", "比优比优哈哈哈", "忘了我是兜", "shiyue", "Ani", "Eleven",
			"不许直视本大王", "Pgraceful", "痴情最无聊", "Sheena", "青阳无忌", "阿耶", "郑小熊",
			"罗家大院的妹子", "Oranicha", "xunyuxin", "zzzwalker", "坷茬马厥", "火山火山",
			"隐形超人", "只吃尸体的猫", "vampire", "shmily", "发条L", "呼吸而已，不想找了",
			"我是一只香蕉", "猫年猫月猫日", "傾盃樂", "高野", "梅三娘", "罄竹难书", "炮弹下不死不勃",
			"红豆", "mango", "Moomin", "itachi", "Miracle阿暄暄", "丁一木有小丁丁",
			"关忆北", "?. Paris", "仙人掌棉花球", "mercy", "迷?", "慕容白白", "遥远的她",
			"血腥玛丽", "桃姬", "姑娘有腔调", "snowcat", "酷酷爱魔兽", "言栗子", "八千杯",
			"薄荷微光少年时", "许大官人", "李豆子", "Bonjour.菜菜酱", "玛丽玛丽轰", "面儿", "走在路上",
			"浮夸、", "亮亮最近很烦恼", "阿Lo阿", "Say颜", "清水沐儿", "隔壁家的少女", "科特迪瓦",
			"兔子等着瞧", "豚豚睿", "iroha", "阿巴鲁西西", "另外一个自己", "老渊", "Xenophon",
			"十元", "@大王小王", "大鼻子怪", "蜗牛凶猛", "小V", "徐导演!", "花花", "斯万",
			"谁家二姑娘", "失眠的星星", "S.", "不理不理左卫门", "豆喵", "进击的蒟蒻", "猪小腿",
			"大头儿子", "睫猫芄弯", "上好佳Oishi", "Mr.W", "cvvc", "投机分子", "蒙上乌干纱.",
			"收获颜色", "影微淡", "告别我", "butterfly", "喵酱", "miu", "Lichi茄",
			"没上发条只爱橙", "Pentakill。", "麒麟", "大力", "不四", "薯条不沾酱", "午梨", "三低",
			"袋鼠蛋蛋打火机", "热带北极熊X", "李十萬。", "SNEAKY RED", "Liu", "Substratum",
			"清风深海", "田大牙", "宝二", "傻的嗎葉喪喪", "洛桃", "Hhyoyeon", "花二刀",
			"大奥中的红梅", "恩诺拉盖伊", "野原新之助^^", "林核桃是我", "一颗秋天的树", "论贝爷的炼成",
			"QueenB", "-強力拚装武士", "苏葫芦要进阶", "唐僧哥哥的喵喵", "LLLLLLLLLL.G",
			"李小花儿", "花豹 和人类", "塔斯马尼亚", "Intermezzo", "大头鬼", "Serenia",
			"正能量", "温心", "Susie_", "酸菜我是翠花儿", "没人知道！", "我儘。", "水煮牛肉好好吃",
			"羊妞。", "大易归真", "麦田部落酋长", "Nancy", "深井冰", "梦里养Panda", "＿瘾、",
			"mono", "田尼玛戴眼镜", "莫凡。", "呆呆呆呆呆西", "鬼小白", "回锅肉", "白薰",
			"从此不说我爱你", "把爱情给墨水", "傲娇的喵咩咩", "mona", "黄糖糖", "Les Nymphéas",
			"冷冷", "SaDaHr", "靴豆妹", "软糖盟主D少侠", "枪之又左", "颜。", "黎明公主", "菊酱",
			"屋顶君°", "白兔仔", "土司小姐", "破烂", "跟我学做菜吧", "猫大人求灵感", "夏樹", "Ms.水吉",
			"想念圣诞节", "、朕有孕在身", "兔几", "skyexe", "优优", "alice", "暮修", "张小馋",
			"陈陈陈", "木耳君和你妹", "三瓶牛奶菌", "snow豆豆", "JoyceYang", "晓月", "话未了",
			"阿尔小屋", "西风几时换流年", "不拉不拉不拉", "曲诚", "大喵喵喵的", "渡心。", "GUMI",
			"一J雨rabbit", "满BUFF灰机", "话女侠", "一只抖M喵", "小邋遢。", "青豆小姐",
			"SepToJan", "Rosemary", "月光剩女", "^?^笑忘书~~`", "白头山大姑父", "良庶民",
			"天黑?变路痴", "我的名字叫熊吉", "马克思帝国主义", "Kiko", "LiHK", "西瓜君~zZ",
			"伤脑筋", "王炫酷", "治愈系", "求不得", "王大锤子", "缘静", "无眄之后", "ISLAND",
			"粉肠褒", "小北是胖大海~", "得唔得呀_", "孤勇的弗里达", "JanePeng", "。一念成执",
			"田森碟", "闪烁的马", "玻璃里", "且听风吟", "雨落孤城", "且陶陶。", "棉棉dream",
			"妙不可言", "麦克菲", "宇宙无敌大鸡鸡", "世上第一英俊", "Yomo", "来人呐", "Jini",
			"林雨雾", "骑着草泥马去赶集", "璎小珞", "奥兰酱", "Sarah一个人", "元气少女马铃薯", "柏轻舟",
			"一直很缺愛", "苏小妞", "赤座阿卡林", "荼荼", "神经旅人", "命运像个神射手", "黒sè餅乾。",
			"Geri", "钥匙上养条狗", "橘色色散", "田纳西", "我要做个小婊砸", "小美味",
			"Time traveler", "豆之逗 非常逗", "鸡蛋苹果梨", "鱼丫头", "最喜欢下雨天", "莫大君?",
			"SeeLee", "大龅牙", "Fan.", "等到樱花盛开", "流云常在", "青城山下白素贞", "欧尼酱~",
			"你不认识我", "FayeAIbaobao", "云落", "2妹", "清洁虾", "Kevin182",
			"rocky", "林z", "孔雀1989", "W_Heisenberg", "LuciaWong", "充气豹",
			"百花深处胖哒裤", "孔连顺", "类子靠撒", "千鹤wink", "袋鼠是驯马师", "MAYqueen。",
			".．呆呆小饭粒", "胡列那", "抛書人", "貌美如花小姨妈", "孔园长", "微毒。",
			"ElephasMaximus", "薄荷-Joyce", "Sapphire陛下", "Rainy", "Mayu",
			"Sai.", "浮生若梦。", "我是小小霜", "我的女神是姑姑", "白黑", "Summer酱", "能卷则卷",
			"骗子猪", "LaSummer" };

	public static String[] signatureList = { "自己囧个~~", "你为什么不问问神奇海螺呢?", "人最重要的是开心嘛", "。",
			"http://meowcy.taobao.com", "即使难过也要灿烂微笑", "用时间过滤，留下对的人。",
			"表面镇定并不是保护色", "默念", "every thing happens for good",
			"我灰不回去了啊啊啊啊", "我也想瘦成纸片人", "从YJcon逐步变成lolicon……", "人不流氓枉青年",
			"相册请勿转载", "好困。", "人在胖，天在看。", "禁止yp", "感情洁癖患者 PS相册有闲置",
			"独在异乡为异客，踽踽独行何处停", "gluten 100%！液！", "将你还给你", "请叫我猫猫",
			"Hi,我叫饭盒。", "再来一瓶藿香正气水！！！", "顺便还是个小心眼", "我乱入了这个世界", "google",
			"路漫漫其修远兮 吾将画啊画啊画", "我也是高原的孩子啊~", "明日复明日，明日何其多", "此生但愿有枝可依....",
			"不畏将来，不念过往。", "永远年轻，永远热泪盈眶", "一个小女子", "f_ck the rest", "纠结",
			"方向不明决心大，心中无数办法多", "0 0", "喵～", "有生之年狭路相逢", "来梗啦",
			"求租浙江山区农村住宅。", "开始豆瓣。在路上", "唐僧哥哥快出现", "大音无声，大象无形。",
			"喜欢曾经那个勇敢自信的自己。", "天壤间万类众俦，纷纷者各有所属", "基于人工神经网络的嘴炮系统",
			"尋找 蘇 帕 曼。", "多毛的王储熬成了秃头的国王。", "今天没吃饭，觉得自己还是胖胖哒", "万年路人",
			"一级级上塔尖欣赏 欣赏你忧伤", "做不成软妹子 就继续做女汉子", "我是不是很空呀~", "存在皆自然", "我爱你",
			"头像是本人？表象是本质？", "储能中...", "豆瓣是个好地方，不能自拔←。←", "Continued story",
			"啊呸", "张志明请举手", "POWER", "那些烦恼来自，有时候的迟疑", "死于鼻炎",
			"ABCDEFG。。。。", "抹茶&红豆的狂热爱好者。", "桃花春风一杯酒，一杯一杯又一杯",
			"不值得别人去爱，去爱别人不值得", "翅膀硬就折不断", "beauty and darkness inspire me",
			"我爱蔡枫华", "爱情不可靠 不要轻易相信爱情", "小公主在恋爱中甜蜜", "傻逼一样的坚持，终获牛逼的结果",
			"*-*......哒哒哒的~~*-*", "不要着急！！耐住性子！", "要啥签名", "生活给了人们太多教训！",
			"i pray to be only yours.", "怪我咯？", "下雨了，出去走走",
			"我来自刻薄星球 是吐槽星人", "wx：ausvipkf", "完美。完美", "?( ω ", "刺客信条",
			"陪伴是最长情的告白。", "灯光再亮 也抱住你。", "你感动了我，坟蛋", "宁愿是条船，如果你是大海。",
			"对于补档目前无能中……请见谅", "call me captain", "骚是马叉蠢。", "走啊走，走啊走",
			"hey sexy lady~", "不关注豆油个毛线", "世间事除了生死，哪一桩不是闲事", "愿成为一朵霸王花。",
			"love me,if you dare.", "无忧亦无惧", "我的征途是星辰和大海", "ei",
			"新浪微博：马克思帝国主义", "诗酒趁年华", "如花儿般恬不知耻的盛开。", "快来我相册看闲置好嘛~~~",
			"可怜九月初三夜 露似真珠月似弓", "我覺得我系一個痱滋人 你認為呢.", "你拉不出屎是因为没有看哔哔哔哔",
			"是该结束了！", "换个头像感觉自己萌萌哒", "可以不露臉,但一定要露點!!!", "Bazinga!!!",
			"节操！！！", "不吃水果会枯萎。", "你是我猜不到的不知所措", "要相信你愛的人說愛你是真的愛你",
			"自找的痛，又何必喊疼...", "吉他和梦想，啤酒和死党。", "仰天大笑出门去 我辈岂是蓬蒿人",
			"转租魔都塘桥line 4，详情戳相册", "感冒了依然大吃冰淇淋", "for oneself", "给我永不纠结的技能",
			"看见红发的基佬就想@莱茵哈特", "坚持到底。", "男朋友会散打", "miao~", "越来越懒惰",
			"怪我太年轻，是人是狗分不清。", "知福惜命~", "上天待我不薄，我更要加倍努力", "胆小鬼胆小鬼胆小鬼、胆小鬼。",
			"爱旅行爱摄影爱阅读爱球赛", "不能瘦到100斤我吃什么都没滋味", "顺我者好玩，逆我者傻逼", "双鱼男一生黑",
			"惟愿人生这一场，如长乐，未央", "愿天下美少年皆有才华、皆无家室", "←风一样的吕子", "小南在橙郡",
			"感谢你，赐我一场空欢喜。", "小女子能胖能瘦~~~", "懵懵懂懂，摇摇摆摆···",
			"只要思想不滑坡，方法总比困难多", "给时间一点时间", "故事的最后你好像还是说了，拜拜", "GUAGUAGUA",
			"金秀贤不是小胖子", "so mean。", "我爱吃肉，无肉不欢。", "右心房很甜", "为你我受冷风吹",
			"无奈的觉悟只能更残酷。", "嗯哼", "我该怎么办?", "情像雨点 似断难断", "青春伊始，人生未完待续",
			"当当当当！！！！！", "不谓来生，不畏过去...", "喜欢就是喜欢。", "人生在寂静中消磨", "粉象",
			"我本将心向明月 奈何明月照沟渠", "厚积薄发", "拿什么养你，我的爱人 O-O", "yellow submarin",
			"HOME", "最喜歡你看不慣卻幹不掉我的樣子", "咸到蛋疼", "原来我非不快乐，只我一人未发觉", "我想要太阳光",
			"没什么可给你 但求凭这阙歌", "Stay CHIC.", "减肥事业生生不息！",
			"http://shop71906352.taobao.com", "那是秘密。", "Peace&Revolution.",
			"半途而吠", "笨拙地生活", "韵gor fonfon", "苦海翻腾，人海浮沉。", "人如头像+名字",
			"已婚勿扰。", "一生懸命頑張ってます", "Heaven can wait", "快叫我英明神武的组长大人！！！",
			"路上路上路上", "指缝的阳光。", "http://weibo.com/u/1832158075",
			"2014年盼着遇见对的你", "与君共晨夕，足以解世味。", "麻辣烫专家，羊肉串儿掌门。",
			"亲！！！！包邮么！！！！", "我要很多很多好看的小布头！", "梦想撑爆了脑瓜", "标准林黛玉上身",
			"Sigh no more", "梦在变凉。", "易知难", "弱水三千 只取一瓢饮。。。", "要独立呢。",
			"你若盛开，蝴蝶自来", "就像蝴蝶飞不过沧海。", "我的天馬行空", "死亡之花，曼珠沙华", "香肠香肠我爱中国香肠",
			"加油！", "我爱宽叔！！！", "just a long long time", "蛋黄酱什么的，最、最讨厌了啊！",
			"你好，再见。", "小孩子才讲对错，成年人只看脸！", "从心|不忘初心，方得始终", "大力出奇迹！",
			"雀斑小姐吉莉安。", "闲的流油了", "淹没在文化混乱过渡的尴尬一代", "此心安處 便是吾鄉", "让我为你唱首歌",
			"有是奇迹 无是常态", "君子豹变，其文蔚也", "斯宾诺莎和斯克里亚宾，都好难", "马不停蹄的忧伤", "你是光",
			"一直向前", "(?._.`", "敢笑春哥不爷们！", "神说要有光", "飞得太高会被太阳烤焦的",
			"醉时歌哭醒时迷", "无情生活，剔透明亮。", "two drifters~", "减肥不是为了变轻，而是变细！",
			"我们热爱自由，只是憎恶主子。", "Bored as fuck.", "www.ikk5.com 动漫连载ing...",
			"the truth heals", "(;???Д??`", "不痛不痒。。。。", "慵懒的靠在你看不见的地方",
			"嘿.巴扎黑~", "需关注 寻关怀", "骑马倚斜桥", "围观专业户", "我就是特别粘人！除非我在工作…",
			"黑了木耳，紫了葡萄，软了香蕉。", "你在烦恼什么", "shop108126807.taobao.com",
			"走出去引进来", "结局在改变", "微笑女王", "你唯一缺的就是一颗从容的心。", "胖胖君与二羊的滴滴 滴嗒",
			"瘦回17岁...耶", "我们的目标是星辰大海~", "没什么好说的了。", "除了自己，都是别人。",
			"看坟守墓抱关击柝", "衬衫的价格是 九磅十五便士", "大爷 买麻薯嗎 新鲜又热乎", "认输之前，我依然用力地活着！",
			"biu biu biu~~", "PRAY", "(*?︶?*", "來年樹倒身影孤煙花散", "期待暴风雨",
			"寂寞东篱湿露华，依前金靥照泥沙", "目标：自己养自己", "摇你的滚。",
			"theres always a better world", "澳洲代购详请戳头", "坦然面对你人生的阴影",
			"生命不息，奋斗不止", "我是“木头大叔”", "Quizás,quizás,quizás",
			"所幸你曾被这世界温柔相待", "人生苦短，及时行乐。", "Mayonnaise", "我确定现在的生活就是我想要的",
			"就这样简简单单", "三更有梦书当枕，卧看梧桐听雨声", "自娱自乐中~", "风景再美，终会迷途。",
			"我要走好运！！！", "世上多少笨小孩，未曾深爱已言别", "我想要什么都可以", "ROOTLESS", "骗子。",
			"我喜欢独白胜过众人的彩排。", "keep smile", "不畏将来，不念过往", "学不会用p眼看世界", "帅弟弟",
			"不剪头发我会死！", "Hester", "~(?????", "柯小剛", "南渡北归", "行在路上 走在脚下",
			"有时感觉世界与我无关一样", "我一定不是你想象中的那个我", "KEYS", "妈妈是我的缪斯",
			"我的骄傲无可救药。", "伤人一千 自损八百", "心塞转心肌梗塞。。。", "原谅我这丫森不羁放荡爱吐槽",
			"现在我不想让你知道", "TRUST NO BITCH!", "want to be a hunter again",
			"好好活着 因为我们会死很久", "夜空中最亮的蛇精病！哈哈~", "啦啦啦", "四周环绕着色魔色狼",
			"自闭症患者好吗！！！", "不尽如人意贯穿了我整个人生。", "时光流走了而我依然在这儿", "存多点钱钱",
			"我也只是一颗寂寞的行星", "完。", "哼，愚蠢的人类", "此心安处", "世间安得双全法,不负如来不负卿",
			"扫地扫地扫心地，心地不扫空扫地", "好好热爱生活吧", "细腻生活 糊涂老去", "没事",
			"shop108966852.taobao.com", "目标是：瘦身成家出国吃天下", "被你搞暈了~@@!!",
			"没事不惹事，有事不怕事", "不减肥真会死...", "我就是女神经病你管我啊~", "2逼青年历险记", "各安天涯。",
			"你好", "??[????]?", "屎涵在这里~(≧▽≦", "在等烤先生", "好苗和毒草一起欣欣向荣",
			"我们家有很多没用的东西 比如我", "多说无益", "（梦里养咩咩）", "唯有美食不可辜负",
			"。。。。。。。。。。。。。。。", "过过过过过>>过儿...", "如花美眷 似水流年", "净系心头一个勇字",
			"干杯~！", "嘘。别吵", "只有哼唱的才是优美的！", "喜欢生活，舍不得花时间。", "大爱 总是值得期待...",
			"真人不出镜，欢迎假冒", "迎面吹来料凉爽滴风~~~", "嘴壮的人生无法回头", "唯有美食与爱，不可辜负。",
			"加油！挺过去！小伙伴们！", "执着等待~~~", "Hes Just Not That Into You",
			"勿忘初心。", "围绕在心底的沉重感才是常态", "敗北の少年", "知止而后能定，定而后能安",
			"懒，很懒，灰常懒......", "好时光，莫辜负~", "但行好事 莫问前程", "放开吃 努力跑",
			"爱护小动物人士。", "肤如凝脂 寿比南山", "酸菜上翠花儿~", "青春有主,此号作废~",
			"我们的爱情是秘密 不能成立", "麋鹿，麋鹿，飞身而去", "喜欢安静,喜欢走走停停~", "度年如日。",
			"绚烂至极终将归于平凡。", "我妈说，身体健康最重要。", "悲催的大粗腿", "爱吃桃子的喵", "一颗流浪的心。",
			"买烤箱还是缝纫机？", "请勿豆油。", "安履其素。", "每天只能睡7小时是什么病", "人生就是要尽量装作么的屌丝",
			"要惜时。", "懒癌晚期", "他在春天那一边，你的秋天刚落叶", "psychotherapist", "后会无七",
			"喜欢淘外贸原单 zheng800.com", "小生活。", "想你时你在舔鞭。", "我知道午后的清风会唱歌-高迪诺",
			"需要不断的自省。", "repairing this me", "做一朵安静的美男子~", "蜜糖只有你", "以柔克刚",
			"处/双/枰/蝎/射/狮/羊/瓶/鱼", "反射弧略微有点长。_(:з」∠", "有朝一日画在手，黑遍天下双标狗",
			"up", "做人正经就好，讲话那么正经干嘛", "走在街上就疯了。。。", "给自己的生活添些惊喜",
			"别对着我头像yy臭流氓", "我的青春，也不是没伤痕。", "朴树一样朴素", "你会喜欢现在我的吗",
			"查无此人啦啦啦", "躲", "永远年轻 永远热泪盈眶", "是你路过我的倾城时光。", "业余毒舌20年",
			"Hallelujah.", "还要不要狗了~", "老公一提到婆婆我就急！！", "姑娘，上茶。爷要嫖你。",
			"我也搞不清楚我是干什么的。", "首席伴娘的", "你永远无法叫醒一个装睡的人",
			"You are my sunshine", "内衣http://jiu219.taobao.com", "早睡早起身体好",
			"2014，干杯。", "现在去拯救地球还来得及吗", "春江潮水连海平，海上明月共潮生", "其实我是纯真的小学生",
			"我庆幸人潮汹涌", "不要恋战", "get off", "华丽的冒险", "?生活?有诗有远方...",
			"做我的朋友都快乐~~", "_>", "鼓楼的夜晚时间匆匆", "在生命里最美暖流是你的问候。", "就是一傻逼。。。",
			"眼高手低没作为", "我永远也做不到让所有人满意", "胖子都是可耻的T^T", "出来混迟早要还的",
			"治愈算什么 自愈才是王道", "闻弦歌而知雅意", "良宵苦短，白日梦长", "浮躁", "来自鸡血共和国",
			"看什么看！", "无需多言。", "轻轻闭上眼睛 此刻我觉得清晰", "人工顶帖组组长，夜之奥古斯都。", "循规蹈矩",
			"切，又是我么。", "你这么浪你爸妈知道吗", "Not nice", "哟~~~~~~", "少壮不努力,一生在内地.",
			"流云漓彩", "@#?%…->&$[*+_~|", "遇见时，天很蓝", "莫名其妙在一起", "gaga",
			"唯一信奉知识改变命运~", "亲爱的伽利略，带我走。", "少年夫妻老来伴。",
			"line的ID.bella.yu快加我吧~", "不高兴不高兴", "京剧 相声 三国 好吃的", "我喜欢我的懦弱",
			"上帝啊我为毛连个男神都没有", "je me suis prend que sauce de", "囀る鳥は羽ばたかない",
			"我们在时代与金曲之中失去", "各种渣属性费电死宅", "其后为此生爱恨拔足狂奔。", "待我长发至腰，少年娶我可好。",
			"有时候只是需要温暖的拥抱而已", "日防夜防，鸡贼难防", "相濡以沫，不如相忘于江湖。", "自私自由的生活",
			"不想睡。", "衬衫脑残粉", "你一再的迁就我", "木木木木木", "52赫兹的鲸鱼", "“隐，隐，隐。。。”",
			"一小群绵羊来葡萄园吃草。咩!", "嗷~！", "自卑与自恋交替发作患者~", "习惯被习惯，可怕的惯性",
			"顺势而为，我自逍遥", "why you so 屌？", "糟气蓬勃", "痛就痛了吧。。。", "你会不会喜欢我？",
			"无组织不站队，不要试图挑战我。", "戒辣啊啊啊啊啊啊。", "新世界已经来临", "好好搞学习，长大泡帅哥",
			"哃嘘呵吸嘻吹呼", "わが征くは星の大海", "平常心", "德你妹国代尼玛购！", "@Amtrak Wars",
			"LOVE", "心有猛虎 细嗅蔷薇", "等雨停了我就去找你。", "聂鲁达三拳打死陈冠希", "他在寫詩",
			"人生短短几个秋。", "你的人生是你自己选择的结果。", "喜欢美食，喜欢自由。", "受騙的那個比騙徒更混帳",
			"躺太久脸都平了……", "为色么还要我用肥笑来带过~", "boom boom boom 咖喱给gay", "我本薄凉",
			"hi,malibu", "人懒嘴馋", "恨不知所终，而纠结流离", "一见你，我就开心的像个小傻瓜",
			"选择我，或不抱我。", "说个p的黄瓜嘞！", "做个抗红血丝小达人！", "徙倚何所依？依于极高明而道中庸",
			"事儿逼记仇心眼小", "只有偏执狂才能生存", "自由而无用", "biu!!!!", "人各有痣，长在脸上，或屁股上",
			"以梦为忆", "塞翁失马，焉知非福。", "恋爱的一次性筷子", "自語者~~", "一年好处,是霜轻尘敛,山川如洗。",
			"我要当妈妈啦", "闭关学习一个月", "怎么换豆瓣头像。。。", "一字记之曰宅", "何惧他金戈铁马，自有水袖来挡",
			"吃吃吃吃吃！", "生存以上，生活以下", "我是大俗人", "keep walking or Ill kill you",
			"天垂六幕千山外，何处清风不旧家", "多酱", "通經明史 識體達用", "你在我記憶旅行",
			"你走了真好 不然总担心你要走", "你不是 秋天。", "原谅我一生放荡不羁爱装逼！", "镜花水月一场梦幻",
			"等爱的抠脚大妈", "咩啊！咩咩啊！", "俗人。", "远离颠倒梦想",
			"The journey is the reward", "问菩萨为何倒坐，叹众生不肯回头",
			"欲寄彩笺兼尺素，山高水阔知何处", "成功给笔记本除尘了！！！", "你看起来好像很好吃", "干啥啥不行 吃啥啥没够",
			"Let It Be", "在路上。。厚积薄发！", "希望这里能让自己成长", "与爱共生", "不过就是这样",
			"孤独的人眼里才会有风景", "赞助:http://haorz123.com好日志", "不往人群里走",
			"内心住着一只巨蟹的摩羯", "找根橡皮筋做成弹弓子打你家玻璃", "紫檀未灭，我亦未去。",
			"以最小的伤亡。获取最大的利益", "忘记名字的人是木有未来的", "应是绿肥红瘦", "轻舟已过万重山",
			"逢考必过逢考必过逢考必过", "任何人都要出示证件！", "过好自己的生活", "向来缘浅，奈何情深。",
			"王安旭，你害得我好苦哇！", "不做下一个谁 只做这一个我", "大得受不了", "爱情会活在当时光节节败退后。",
			"嘿嘿", "消磨这一世魂也陪你闯。", "很忙的。", "一息百年，永歲飄零。", "╮(╯_╰",
			"当我们某一天回首，会不会流泪", "简单生活", "ADDC" };
}
