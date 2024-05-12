package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMedia$3", f = "CutOptimizedVideoChosenHandler.kt", l = {382, 415, 427, 479, 481, 485, 486, 513, 520, 532, 551, 543, 551, 551}, m = "invokeSuspend")
/* renamed from: X.5W5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5W5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public Object LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public long LJLLLLLL;
    public long LJLZ;
    public long LJZ;
    public long LJZI;
    public int LJZL;
    public /* synthetic */ Object LL;
    public final /* synthetic */ Intent LLD;
    public final /* synthetic */ Intent LLF;
    public final /* synthetic */ List<MediaModel> LLFF;
    public final /* synthetic */ C43544H7c LLFFF;
    public final /* synthetic */ CreativeModel LLFII;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LLFZ;
    public final /* synthetic */ String LLI;
    public final /* synthetic */ C34K LLIFFJFJJ;
    public final /* synthetic */ long LLII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5W5(Intent intent, Intent intent2, List<? extends MediaModel> list, C43544H7c c43544H7c, CreativeModel creativeModel, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, String str, C34K c34k, long j, InterfaceC67352kd<? super C5W5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LLD = intent;
        this.LLF = intent2;
        this.LLFF = list;
        this.LLFFF = c43544H7c;
        this.LLFII = creativeModel;
        this.LLFZ = interfaceC65784Pro;
        this.LLI = str;
        this.LLIFFJFJJ = c34k;
        this.LLII = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C5W5 c5w5 = new C5W5(this.LLD, this.LLF, this.LLFF, this.LLFFF, this.LLFII, this.LLFZ, this.LLI, this.LLIFFJFJJ, this.LLII, interfaceC67352kd);
        c5w5.LL = obj;
        return c5w5;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0634, code lost:
    
        if (r4 != false) goto L224;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0016. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0348 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0392 A[Catch: all -> 0x044b, TryCatch #4 {all -> 0x044b, blocks: (B:112:0x0376, B:114:0x0392, B:117:0x03ea, B:118:0x0400, B:303:0x03ed), top: B:111:0x0376 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x044a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0542 A[Catch: all -> 0x06d0, TryCatch #0 {all -> 0x06d0, blocks: (B:126:0x051b, B:128:0x0542, B:132:0x054d, B:135:0x0556, B:136:0x0568), top: B:125:0x051b }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x054d A[Catch: all -> 0x06d0, TryCatch #0 {all -> 0x06d0, blocks: (B:126:0x051b, B:128:0x0542, B:132:0x054d, B:135:0x0556, B:136:0x0568), top: B:125:0x051b }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0997 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x05e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x064e A[Catch: all -> 0x06cd, TryCatch #5 {all -> 0x06cd, blocks: (B:138:0x0585, B:150:0x058c, B:153:0x059e, B:156:0x05ab, B:159:0x05b8, B:160:0x05bc, B:163:0x05c9, B:166:0x05d6, B:170:0x05ed, B:172:0x05f1, B:178:0x05fd, B:182:0x0608, B:184:0x060f, B:186:0x0620, B:188:0x0629, B:195:0x0639, B:201:0x064e), top: B:137:0x0585 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0714 A[Catch: all -> 0x076e, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x076e, blocks: (B:90:0x029b, B:96:0x02cb, B:102:0x02f3, B:108:0x0317, B:119:0x040e, B:122:0x0485, B:205:0x0714, B:208:0x0721), top: B:89:0x029b }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x07b6 A[Catch: all -> 0x0970, TryCatch #1 {all -> 0x0970, blocks: (B:8:0x002e, B:11:0x0050, B:13:0x005c, B:17:0x0068, B:24:0x00e0, B:27:0x00f1, B:28:0x00f3, B:30:0x0116, B:31:0x0131, B:35:0x015a, B:37:0x0160, B:44:0x019f, B:47:0x01f2, B:49:0x020c, B:52:0x0169, B:53:0x016f, B:55:0x0175, B:57:0x017f, B:63:0x018d, B:69:0x0192, B:70:0x0196, B:74:0x025e, B:82:0x0283, B:85:0x028e, B:88:0x0299, B:211:0x07ac, B:213:0x07b6, B:214:0x07bd, B:216:0x07c7, B:318:0x014e, B:319:0x0079, B:322:0x00b6, B:323:0x00bc, B:325:0x00c2, B:327:0x00ce, B:330:0x00d8, B:340:0x00b3, B:342:0x01ef, B:344:0x025b, B:346:0x0373, B:348:0x03e7, B:350:0x0482, B:352:0x0518, B:354:0x070d, B:356:0x07a9, B:358:0x086d, B:361:0x08f2), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x07c7 A[Catch: all -> 0x0970, TRY_LEAVE, TryCatch #1 {all -> 0x0970, blocks: (B:8:0x002e, B:11:0x0050, B:13:0x005c, B:17:0x0068, B:24:0x00e0, B:27:0x00f1, B:28:0x00f3, B:30:0x0116, B:31:0x0131, B:35:0x015a, B:37:0x0160, B:44:0x019f, B:47:0x01f2, B:49:0x020c, B:52:0x0169, B:53:0x016f, B:55:0x0175, B:57:0x017f, B:63:0x018d, B:69:0x0192, B:70:0x0196, B:74:0x025e, B:82:0x0283, B:85:0x028e, B:88:0x0299, B:211:0x07ac, B:213:0x07b6, B:214:0x07bd, B:216:0x07c7, B:318:0x014e, B:319:0x0079, B:322:0x00b6, B:323:0x00bc, B:325:0x00c2, B:327:0x00ce, B:330:0x00d8, B:340:0x00b3, B:342:0x01ef, B:344:0x025b, B:346:0x0373, B:348:0x03e7, B:350:0x0482, B:352:0x0518, B:354:0x070d, B:356:0x07a9, B:358:0x086d, B:361:0x08f2), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0856 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0872 A[Catch: all -> 0x096e, TRY_ENTER, TryCatch #6 {all -> 0x096e, blocks: (B:231:0x0872, B:234:0x0887, B:236:0x0892, B:239:0x089b, B:242:0x08a2, B:268:0x06a4, B:271:0x08f5, B:274:0x0905, B:277:0x090c, B:280:0x092d), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x08c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e0 A[Catch: all -> 0x0970, TryCatch #1 {all -> 0x0970, blocks: (B:8:0x002e, B:11:0x0050, B:13:0x005c, B:17:0x0068, B:24:0x00e0, B:27:0x00f1, B:28:0x00f3, B:30:0x0116, B:31:0x0131, B:35:0x015a, B:37:0x0160, B:44:0x019f, B:47:0x01f2, B:49:0x020c, B:52:0x0169, B:53:0x016f, B:55:0x0175, B:57:0x017f, B:63:0x018d, B:69:0x0192, B:70:0x0196, B:74:0x025e, B:82:0x0283, B:85:0x028e, B:88:0x0299, B:211:0x07ac, B:213:0x07b6, B:214:0x07bd, B:216:0x07c7, B:318:0x014e, B:319:0x0079, B:322:0x00b6, B:323:0x00bc, B:325:0x00c2, B:327:0x00ce, B:330:0x00d8, B:340:0x00b3, B:342:0x01ef, B:344:0x025b, B:346:0x0373, B:348:0x03e7, B:350:0x0482, B:352:0x0518, B:354:0x070d, B:356:0x07a9, B:358:0x086d, B:361:0x08f2), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0954 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03ed A[Catch: all -> 0x044b, TryCatch #4 {all -> 0x044b, blocks: (B:112:0x0376, B:114:0x0392, B:117:0x03ea, B:118:0x0400, B:303:0x03ed), top: B:111:0x0376 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0116 A[Catch: all -> 0x0970, TryCatch #1 {all -> 0x0970, blocks: (B:8:0x002e, B:11:0x0050, B:13:0x005c, B:17:0x0068, B:24:0x00e0, B:27:0x00f1, B:28:0x00f3, B:30:0x0116, B:31:0x0131, B:35:0x015a, B:37:0x0160, B:44:0x019f, B:47:0x01f2, B:49:0x020c, B:52:0x0169, B:53:0x016f, B:55:0x0175, B:57:0x017f, B:63:0x018d, B:69:0x0192, B:70:0x0196, B:74:0x025e, B:82:0x0283, B:85:0x028e, B:88:0x0299, B:211:0x07ac, B:213:0x07b6, B:214:0x07bd, B:216:0x07c7, B:318:0x014e, B:319:0x0079, B:322:0x00b6, B:323:0x00bc, B:325:0x00c2, B:327:0x00ce, B:330:0x00d8, B:340:0x00b3, B:342:0x01ef, B:344:0x025b, B:346:0x0373, B:348:0x03e7, B:350:0x0482, B:352:0x0518, B:354:0x070d, B:356:0x07a9, B:358:0x086d, B:361:0x08f2), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x014e A[Catch: all -> 0x0970, TryCatch #1 {all -> 0x0970, blocks: (B:8:0x002e, B:11:0x0050, B:13:0x005c, B:17:0x0068, B:24:0x00e0, B:27:0x00f1, B:28:0x00f3, B:30:0x0116, B:31:0x0131, B:35:0x015a, B:37:0x0160, B:44:0x019f, B:47:0x01f2, B:49:0x020c, B:52:0x0169, B:53:0x016f, B:55:0x0175, B:57:0x017f, B:63:0x018d, B:69:0x0192, B:70:0x0196, B:74:0x025e, B:82:0x0283, B:85:0x028e, B:88:0x0299, B:211:0x07ac, B:213:0x07b6, B:214:0x07bd, B:216:0x07c7, B:318:0x014e, B:319:0x0079, B:322:0x00b6, B:323:0x00bc, B:325:0x00c2, B:327:0x00ce, B:330:0x00d8, B:340:0x00b3, B:342:0x01ef, B:344:0x025b, B:346:0x0373, B:348:0x03e7, B:350:0x0482, B:352:0x0518, B:354:0x070d, B:356:0x07a9, B:358:0x086d, B:361:0x08f2), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x00c2 A[Catch: all -> 0x0970, TryCatch #1 {all -> 0x0970, blocks: (B:8:0x002e, B:11:0x0050, B:13:0x005c, B:17:0x0068, B:24:0x00e0, B:27:0x00f1, B:28:0x00f3, B:30:0x0116, B:31:0x0131, B:35:0x015a, B:37:0x0160, B:44:0x019f, B:47:0x01f2, B:49:0x020c, B:52:0x0169, B:53:0x016f, B:55:0x0175, B:57:0x017f, B:63:0x018d, B:69:0x0192, B:70:0x0196, B:74:0x025e, B:82:0x0283, B:85:0x028e, B:88:0x0299, B:211:0x07ac, B:213:0x07b6, B:214:0x07bd, B:216:0x07c7, B:318:0x014e, B:319:0x0079, B:322:0x00b6, B:323:0x00bc, B:325:0x00c2, B:327:0x00ce, B:330:0x00d8, B:340:0x00b3, B:342:0x01ef, B:344:0x025b, B:346:0x0373, B:348:0x03e7, B:350:0x0482, B:352:0x0518, B:354:0x070d, B:356:0x07a9, B:358:0x086d, B:361:0x08f2), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0160 A[Catch: all -> 0x0970, TryCatch #1 {all -> 0x0970, blocks: (B:8:0x002e, B:11:0x0050, B:13:0x005c, B:17:0x0068, B:24:0x00e0, B:27:0x00f1, B:28:0x00f3, B:30:0x0116, B:31:0x0131, B:35:0x015a, B:37:0x0160, B:44:0x019f, B:47:0x01f2, B:49:0x020c, B:52:0x0169, B:53:0x016f, B:55:0x0175, B:57:0x017f, B:63:0x018d, B:69:0x0192, B:70:0x0196, B:74:0x025e, B:82:0x0283, B:85:0x028e, B:88:0x0299, B:211:0x07ac, B:213:0x07b6, B:214:0x07bd, B:216:0x07c7, B:318:0x014e, B:319:0x0079, B:322:0x00b6, B:323:0x00bc, B:325:0x00c2, B:327:0x00ce, B:330:0x00d8, B:340:0x00b3, B:342:0x01ef, B:344:0x025b, B:346:0x0373, B:348:0x03e7, B:350:0x0482, B:352:0x0518, B:354:0x070d, B:356:0x07a9, B:358:0x086d, B:361:0x08f2), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020c A[Catch: all -> 0x0970, TryCatch #1 {all -> 0x0970, blocks: (B:8:0x002e, B:11:0x0050, B:13:0x005c, B:17:0x0068, B:24:0x00e0, B:27:0x00f1, B:28:0x00f3, B:30:0x0116, B:31:0x0131, B:35:0x015a, B:37:0x0160, B:44:0x019f, B:47:0x01f2, B:49:0x020c, B:52:0x0169, B:53:0x016f, B:55:0x0175, B:57:0x017f, B:63:0x018d, B:69:0x0192, B:70:0x0196, B:74:0x025e, B:82:0x0283, B:85:0x028e, B:88:0x0299, B:211:0x07ac, B:213:0x07b6, B:214:0x07bd, B:216:0x07c7, B:318:0x014e, B:319:0x0079, B:322:0x00b6, B:323:0x00bc, B:325:0x00c2, B:327:0x00ce, B:330:0x00d8, B:340:0x00b3, B:342:0x01ef, B:344:0x025b, B:346:0x0373, B:348:0x03e7, B:350:0x0482, B:352:0x0518, B:354:0x070d, B:356:0x07a9, B:358:0x086d, B:361:0x08f2), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e6  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 2518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5W5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
