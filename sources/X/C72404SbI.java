package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler$checkValidAndUpload$continueRun$1", f = "AIGCPictureHandler.kt", l = {203, 259, 313}, m = "invokeSuspend")
/* renamed from: X.SbI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72404SbI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public float LJLJJL;
    public long LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public /* synthetic */ Object LJLJLLL;
    public final /* synthetic */ AIGCPictureHandler LJLL;
    public final /* synthetic */ long LJLLI;
    public final /* synthetic */ Activity LJLLILLLL;
    public final /* synthetic */ A90 LJLLJ;
    public final /* synthetic */ List<String> LJLLL;
    public final /* synthetic */ InterfaceC88472Yns<List<String>, C76800UCe> LJLLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C72404SbI(AIGCPictureHandler aIGCPictureHandler, long j, Activity activity, A90 a90, List<String> list, InterfaceC88472Yns<? super List<String>, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C72404SbI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLL = aIGCPictureHandler;
        this.LJLLI = j;
        this.LJLLILLLL = activity;
        this.LJLLJ = a90;
        this.LJLLL = list;
        this.LJLLLL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C72404SbI c72404SbI = new C72404SbI(this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, this.LJLLLL, interfaceC67352kd);
        c72404SbI.LJLJLLL = obj;
        return c72404SbI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x03da A[Catch: CancellationException -> 0x0481, TryCatch #0 {CancellationException -> 0x0481, blocks: (B:8:0x03cd, B:9:0x03d0, B:11:0x03da, B:12:0x03dc, B:14:0x03f9, B:18:0x0401, B:25:0x0447, B:30:0x0444, B:31:0x044f, B:34:0x03fc, B:38:0x0043, B:39:0x01e4, B:41:0x01e8, B:44:0x0137, B:46:0x013d, B:48:0x015d, B:50:0x0163, B:52:0x016d, B:54:0x0173, B:56:0x017d, B:57:0x0181, B:59:0x0187, B:61:0x0193, B:62:0x0197, B:65:0x01a2, B:67:0x01a8, B:69:0x01b2, B:70:0x01b6, B:76:0x01c0, B:90:0x01f6, B:92:0x01fc, B:95:0x020b, B:97:0x022d, B:99:0x0230, B:101:0x0241, B:103:0x0289, B:106:0x02aa, B:107:0x02b5, B:109:0x02bb, B:112:0x02c7, B:117:0x02cb, B:118:0x02da, B:120:0x02e0, B:122:0x02ec, B:124:0x02f0, B:125:0x02f8, B:127:0x02f9, B:128:0x0306, B:130:0x030c, B:132:0x0318, B:134:0x031c, B:135:0x0324, B:137:0x0325, B:138:0x0332, B:140:0x0338, B:142:0x0344, B:144:0x0348, B:145:0x0350, B:147:0x03a8, B:148:0x03ac, B:151:0x0351, B:152:0x035c, B:154:0x0362, B:157:0x036e, B:162:0x0372, B:163:0x0381, B:165:0x0387, B:167:0x0395, B:169:0x039b, B:171:0x039f, B:172:0x03a7, B:175:0x01ec, B:177:0x0096, B:178:0x0099, B:180:0x00a1, B:182:0x00ef, B:184:0x0111, B:186:0x0114, B:188:0x005c, B:21:0x040f, B:23:0x0427, B:28:0x0433), top: B:2:0x000f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x03f9 A[Catch: CancellationException -> 0x0481, TryCatch #0 {CancellationException -> 0x0481, blocks: (B:8:0x03cd, B:9:0x03d0, B:11:0x03da, B:12:0x03dc, B:14:0x03f9, B:18:0x0401, B:25:0x0447, B:30:0x0444, B:31:0x044f, B:34:0x03fc, B:38:0x0043, B:39:0x01e4, B:41:0x01e8, B:44:0x0137, B:46:0x013d, B:48:0x015d, B:50:0x0163, B:52:0x016d, B:54:0x0173, B:56:0x017d, B:57:0x0181, B:59:0x0187, B:61:0x0193, B:62:0x0197, B:65:0x01a2, B:67:0x01a8, B:69:0x01b2, B:70:0x01b6, B:76:0x01c0, B:90:0x01f6, B:92:0x01fc, B:95:0x020b, B:97:0x022d, B:99:0x0230, B:101:0x0241, B:103:0x0289, B:106:0x02aa, B:107:0x02b5, B:109:0x02bb, B:112:0x02c7, B:117:0x02cb, B:118:0x02da, B:120:0x02e0, B:122:0x02ec, B:124:0x02f0, B:125:0x02f8, B:127:0x02f9, B:128:0x0306, B:130:0x030c, B:132:0x0318, B:134:0x031c, B:135:0x0324, B:137:0x0325, B:138:0x0332, B:140:0x0338, B:142:0x0344, B:144:0x0348, B:145:0x0350, B:147:0x03a8, B:148:0x03ac, B:151:0x0351, B:152:0x035c, B:154:0x0362, B:157:0x036e, B:162:0x0372, B:163:0x0381, B:165:0x0387, B:167:0x0395, B:169:0x039b, B:171:0x039f, B:172:0x03a7, B:175:0x01ec, B:177:0x0096, B:178:0x0099, B:180:0x00a1, B:182:0x00ef, B:184:0x0111, B:186:0x0114, B:188:0x005c, B:21:0x040f, B:23:0x0427, B:28:0x0433), top: B:2:0x000f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01ec A[Catch: CancellationException -> 0x0481, TryCatch #0 {CancellationException -> 0x0481, blocks: (B:8:0x03cd, B:9:0x03d0, B:11:0x03da, B:12:0x03dc, B:14:0x03f9, B:18:0x0401, B:25:0x0447, B:30:0x0444, B:31:0x044f, B:34:0x03fc, B:38:0x0043, B:39:0x01e4, B:41:0x01e8, B:44:0x0137, B:46:0x013d, B:48:0x015d, B:50:0x0163, B:52:0x016d, B:54:0x0173, B:56:0x017d, B:57:0x0181, B:59:0x0187, B:61:0x0193, B:62:0x0197, B:65:0x01a2, B:67:0x01a8, B:69:0x01b2, B:70:0x01b6, B:76:0x01c0, B:90:0x01f6, B:92:0x01fc, B:95:0x020b, B:97:0x022d, B:99:0x0230, B:101:0x0241, B:103:0x0289, B:106:0x02aa, B:107:0x02b5, B:109:0x02bb, B:112:0x02c7, B:117:0x02cb, B:118:0x02da, B:120:0x02e0, B:122:0x02ec, B:124:0x02f0, B:125:0x02f8, B:127:0x02f9, B:128:0x0306, B:130:0x030c, B:132:0x0318, B:134:0x031c, B:135:0x0324, B:137:0x0325, B:138:0x0332, B:140:0x0338, B:142:0x0344, B:144:0x0348, B:145:0x0350, B:147:0x03a8, B:148:0x03ac, B:151:0x0351, B:152:0x035c, B:154:0x0362, B:157:0x036e, B:162:0x0372, B:163:0x0381, B:165:0x0387, B:167:0x0395, B:169:0x039b, B:171:0x039f, B:172:0x03a7, B:175:0x01ec, B:177:0x0096, B:178:0x0099, B:180:0x00a1, B:182:0x00ef, B:184:0x0111, B:186:0x0114, B:188:0x005c, B:21:0x040f, B:23:0x0427, B:28:0x0433), top: B:2:0x000f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03fc A[Catch: CancellationException -> 0x0481, TryCatch #0 {CancellationException -> 0x0481, blocks: (B:8:0x03cd, B:9:0x03d0, B:11:0x03da, B:12:0x03dc, B:14:0x03f9, B:18:0x0401, B:25:0x0447, B:30:0x0444, B:31:0x044f, B:34:0x03fc, B:38:0x0043, B:39:0x01e4, B:41:0x01e8, B:44:0x0137, B:46:0x013d, B:48:0x015d, B:50:0x0163, B:52:0x016d, B:54:0x0173, B:56:0x017d, B:57:0x0181, B:59:0x0187, B:61:0x0193, B:62:0x0197, B:65:0x01a2, B:67:0x01a8, B:69:0x01b2, B:70:0x01b6, B:76:0x01c0, B:90:0x01f6, B:92:0x01fc, B:95:0x020b, B:97:0x022d, B:99:0x0230, B:101:0x0241, B:103:0x0289, B:106:0x02aa, B:107:0x02b5, B:109:0x02bb, B:112:0x02c7, B:117:0x02cb, B:118:0x02da, B:120:0x02e0, B:122:0x02ec, B:124:0x02f0, B:125:0x02f8, B:127:0x02f9, B:128:0x0306, B:130:0x030c, B:132:0x0318, B:134:0x031c, B:135:0x0324, B:137:0x0325, B:138:0x0332, B:140:0x0338, B:142:0x0344, B:144:0x0348, B:145:0x0350, B:147:0x03a8, B:148:0x03ac, B:151:0x0351, B:152:0x035c, B:154:0x0362, B:157:0x036e, B:162:0x0372, B:163:0x0381, B:165:0x0387, B:167:0x0395, B:169:0x039b, B:171:0x039f, B:172:0x03a7, B:175:0x01ec, B:177:0x0096, B:178:0x0099, B:180:0x00a1, B:182:0x00ef, B:184:0x0111, B:186:0x0114, B:188:0x005c, B:21:0x040f, B:23:0x0427, B:28:0x0433), top: B:2:0x000f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e8 A[Catch: CancellationException -> 0x0481, TryCatch #0 {CancellationException -> 0x0481, blocks: (B:8:0x03cd, B:9:0x03d0, B:11:0x03da, B:12:0x03dc, B:14:0x03f9, B:18:0x0401, B:25:0x0447, B:30:0x0444, B:31:0x044f, B:34:0x03fc, B:38:0x0043, B:39:0x01e4, B:41:0x01e8, B:44:0x0137, B:46:0x013d, B:48:0x015d, B:50:0x0163, B:52:0x016d, B:54:0x0173, B:56:0x017d, B:57:0x0181, B:59:0x0187, B:61:0x0193, B:62:0x0197, B:65:0x01a2, B:67:0x01a8, B:69:0x01b2, B:70:0x01b6, B:76:0x01c0, B:90:0x01f6, B:92:0x01fc, B:95:0x020b, B:97:0x022d, B:99:0x0230, B:101:0x0241, B:103:0x0289, B:106:0x02aa, B:107:0x02b5, B:109:0x02bb, B:112:0x02c7, B:117:0x02cb, B:118:0x02da, B:120:0x02e0, B:122:0x02ec, B:124:0x02f0, B:125:0x02f8, B:127:0x02f9, B:128:0x0306, B:130:0x030c, B:132:0x0318, B:134:0x031c, B:135:0x0324, B:137:0x0325, B:138:0x0332, B:140:0x0338, B:142:0x0344, B:144:0x0348, B:145:0x0350, B:147:0x03a8, B:148:0x03ac, B:151:0x0351, B:152:0x035c, B:154:0x0362, B:157:0x036e, B:162:0x0372, B:163:0x0381, B:165:0x0387, B:167:0x0395, B:169:0x039b, B:171:0x039f, B:172:0x03a7, B:175:0x01ec, B:177:0x0096, B:178:0x0099, B:180:0x00a1, B:182:0x00ef, B:184:0x0111, B:186:0x0114, B:188:0x005c, B:21:0x040f, B:23:0x0427, B:28:0x0433), top: B:2:0x000f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013d A[Catch: CancellationException -> 0x0481, TryCatch #0 {CancellationException -> 0x0481, blocks: (B:8:0x03cd, B:9:0x03d0, B:11:0x03da, B:12:0x03dc, B:14:0x03f9, B:18:0x0401, B:25:0x0447, B:30:0x0444, B:31:0x044f, B:34:0x03fc, B:38:0x0043, B:39:0x01e4, B:41:0x01e8, B:44:0x0137, B:46:0x013d, B:48:0x015d, B:50:0x0163, B:52:0x016d, B:54:0x0173, B:56:0x017d, B:57:0x0181, B:59:0x0187, B:61:0x0193, B:62:0x0197, B:65:0x01a2, B:67:0x01a8, B:69:0x01b2, B:70:0x01b6, B:76:0x01c0, B:90:0x01f6, B:92:0x01fc, B:95:0x020b, B:97:0x022d, B:99:0x0230, B:101:0x0241, B:103:0x0289, B:106:0x02aa, B:107:0x02b5, B:109:0x02bb, B:112:0x02c7, B:117:0x02cb, B:118:0x02da, B:120:0x02e0, B:122:0x02ec, B:124:0x02f0, B:125:0x02f8, B:127:0x02f9, B:128:0x0306, B:130:0x030c, B:132:0x0318, B:134:0x031c, B:135:0x0324, B:137:0x0325, B:138:0x0332, B:140:0x0338, B:142:0x0344, B:144:0x0348, B:145:0x0350, B:147:0x03a8, B:148:0x03ac, B:151:0x0351, B:152:0x035c, B:154:0x0362, B:157:0x036e, B:162:0x0372, B:163:0x0381, B:165:0x0387, B:167:0x0395, B:169:0x039b, B:171:0x039f, B:172:0x03a7, B:175:0x01ec, B:177:0x0096, B:178:0x0099, B:180:0x00a1, B:182:0x00ef, B:184:0x0111, B:186:0x0114, B:188:0x005c, B:21:0x040f, B:23:0x0427, B:28:0x0433), top: B:2:0x000f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022d A[Catch: CancellationException -> 0x0481, TryCatch #0 {CancellationException -> 0x0481, blocks: (B:8:0x03cd, B:9:0x03d0, B:11:0x03da, B:12:0x03dc, B:14:0x03f9, B:18:0x0401, B:25:0x0447, B:30:0x0444, B:31:0x044f, B:34:0x03fc, B:38:0x0043, B:39:0x01e4, B:41:0x01e8, B:44:0x0137, B:46:0x013d, B:48:0x015d, B:50:0x0163, B:52:0x016d, B:54:0x0173, B:56:0x017d, B:57:0x0181, B:59:0x0187, B:61:0x0193, B:62:0x0197, B:65:0x01a2, B:67:0x01a8, B:69:0x01b2, B:70:0x01b6, B:76:0x01c0, B:90:0x01f6, B:92:0x01fc, B:95:0x020b, B:97:0x022d, B:99:0x0230, B:101:0x0241, B:103:0x0289, B:106:0x02aa, B:107:0x02b5, B:109:0x02bb, B:112:0x02c7, B:117:0x02cb, B:118:0x02da, B:120:0x02e0, B:122:0x02ec, B:124:0x02f0, B:125:0x02f8, B:127:0x02f9, B:128:0x0306, B:130:0x030c, B:132:0x0318, B:134:0x031c, B:135:0x0324, B:137:0x0325, B:138:0x0332, B:140:0x0338, B:142:0x0344, B:144:0x0348, B:145:0x0350, B:147:0x03a8, B:148:0x03ac, B:151:0x0351, B:152:0x035c, B:154:0x0362, B:157:0x036e, B:162:0x0372, B:163:0x0381, B:165:0x0387, B:167:0x0395, B:169:0x039b, B:171:0x039f, B:172:0x03a7, B:175:0x01ec, B:177:0x0096, B:178:0x0099, B:180:0x00a1, B:182:0x00ef, B:184:0x0111, B:186:0x0114, B:188:0x005c, B:21:0x040f, B:23:0x0427, B:28:0x0433), top: B:2:0x000f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0230 A[Catch: CancellationException -> 0x0481, TryCatch #0 {CancellationException -> 0x0481, blocks: (B:8:0x03cd, B:9:0x03d0, B:11:0x03da, B:12:0x03dc, B:14:0x03f9, B:18:0x0401, B:25:0x0447, B:30:0x0444, B:31:0x044f, B:34:0x03fc, B:38:0x0043, B:39:0x01e4, B:41:0x01e8, B:44:0x0137, B:46:0x013d, B:48:0x015d, B:50:0x0163, B:52:0x016d, B:54:0x0173, B:56:0x017d, B:57:0x0181, B:59:0x0187, B:61:0x0193, B:62:0x0197, B:65:0x01a2, B:67:0x01a8, B:69:0x01b2, B:70:0x01b6, B:76:0x01c0, B:90:0x01f6, B:92:0x01fc, B:95:0x020b, B:97:0x022d, B:99:0x0230, B:101:0x0241, B:103:0x0289, B:106:0x02aa, B:107:0x02b5, B:109:0x02bb, B:112:0x02c7, B:117:0x02cb, B:118:0x02da, B:120:0x02e0, B:122:0x02ec, B:124:0x02f0, B:125:0x02f8, B:127:0x02f9, B:128:0x0306, B:130:0x030c, B:132:0x0318, B:134:0x031c, B:135:0x0324, B:137:0x0325, B:138:0x0332, B:140:0x0338, B:142:0x0344, B:144:0x0348, B:145:0x0350, B:147:0x03a8, B:148:0x03ac, B:151:0x0351, B:152:0x035c, B:154:0x0362, B:157:0x036e, B:162:0x0372, B:163:0x0381, B:165:0x0387, B:167:0x0395, B:169:0x039b, B:171:0x039f, B:172:0x03a7, B:175:0x01ec, B:177:0x0096, B:178:0x0099, B:180:0x00a1, B:182:0x00ef, B:184:0x0111, B:186:0x0114, B:188:0x005c, B:21:0x040f, B:23:0x0427, B:28:0x0433), top: B:2:0x000f, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01e1 -> B:39:0x01e4). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 1156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72404SbI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
