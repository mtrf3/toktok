package X;

import android.app.Activity;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.touchpoint.core.model.ProfileActivityButton;
import com.bytedance.touchpoint.core.profileicon.ProfileIconViewModel;
import com.bytedance.touchpoint.core.viewmodel.BaseTouchPointDataVM;
import java.util.List;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9Oh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C236079Oh extends AbstractC244999jT {
    public List<ProfileActivityButton> LJLIL;
    public final C214378bB LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public Activity LJLJJL;
    public C234529Ii LJLJJLL;
    public InterfaceC236109Ok LJLJL;

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6 A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:8:0x0019, B:11:0x009b, B:13:0x009f, B:14:0x00a2, B:16:0x00a6, B:21:0x002a, B:24:0x0032, B:26:0x003a, B:28:0x0040, B:30:0x0046, B:32:0x0053, B:34:0x0059, B:36:0x005d, B:37:0x0060, B:39:0x0066, B:41:0x006a, B:42:0x0074, B:44:0x0078, B:45:0x007c, B:47:0x0082, B:49:0x0086, B:50:0x0091, B:52:0x0095, B:53:0x0098, B:54:0x004b), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI() {
        /*
            r6 = this;
            X.9O7 r1 = X.C2MW.LIZ()
            r0 = 3
            X.95U r4 = r1.LIZLLL(r0)
            com.bytedance.touchpoint.core.model.ProfileActivityIcon r4 = (com.bytedance.touchpoint.core.model.ProfileActivityIcon) r4
            android.app.Activity r0 = r6.LJLJJL
            if (r0 == 0) goto L18
            X.9Ii r2 = r6.LJLJJLL
            if (r2 == 0) goto L18
            X.9Ok r0 = r6.LJLJL
            if (r0 != 0) goto L19
        L18:
            return
        L19:
            kotlin.jvm.internal.AqS135S0200000_4 r1 = new kotlin.jvm.internal.AqS135S0200000_4     // Catch: java.lang.Throwable -> L18
            r0 = 201(0xc9, float:2.82E-43)
            r1.<init>(r6, r4, r0)     // Catch: java.lang.Throwable -> L18
            r2.LIZJ()     // Catch: java.lang.Throwable -> L18
            r2.LJFF = r1     // Catch: java.lang.Throwable -> L18
            r5 = 1
            r2 = 0
            if (r4 != 0) goto L2a
            goto L9b
        L2a:
            java.lang.String r1 = r4.iconUrl     // Catch: java.lang.Throwable -> L18
            java.util.List<com.bytedance.touchpoint.core.model.ProfileActivityButton> r0 = r4.profileActivityButtons     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L9b
            if (r0 == 0) goto L9b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L18
            r0 = r0 ^ 1
            if (r0 == 0) goto L9b
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L18
            if (r0 <= 0) goto L9b
            java.lang.String r0 = r4.iconUrl     // Catch: java.lang.Throwable -> L18
            java.util.List<com.bytedance.touchpoint.core.model.ProfileActivityButton> r3 = r4.profileActivityButtons     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L4b
        L46:
            r6.LJLIL = r3     // Catch: java.lang.Throwable -> L18
            r6.LJLJI = r5     // Catch: java.lang.Throwable -> L18
            goto L51
        L4b:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L18
            r3.<init>()     // Catch: java.lang.Throwable -> L18
            goto L46
        L51:
            if (r0 == 0) goto La2
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto La2
            X.9Ok r0 = r6.LJLJL     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L60
            r0.LIZJ()     // Catch: java.lang.Throwable -> L18
        L60:
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L18
            if (r0 != r5) goto L7c
            X.9Ii r2 = r6.LJLJJLL     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L74
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4     // Catch: java.lang.Throwable -> L18
            r0 = 176(0xb0, float:2.47E-43)
            r1.<init>(r6, r4, r3, r0)     // Catch: java.lang.Throwable -> L18
            r2.LIZIZ(r1)     // Catch: java.lang.Throwable -> L18
        L74:
            X.9Ok r0 = r6.LJLJL     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto La2
            r0.LJ()     // Catch: java.lang.Throwable -> L18
            goto La2
        L7c:
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L18
            if (r0 <= r5) goto L91
            X.9Ii r2 = r6.LJLJJLL     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L74
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4     // Catch: java.lang.Throwable -> L18
            r0 = 177(0xb1, float:2.48E-43)
            r1.<init>(r6, r4, r3, r0)     // Catch: java.lang.Throwable -> L18
            r2.LIZIZ(r1)     // Catch: java.lang.Throwable -> L18
            goto L74
        L91:
            X.9Ok r0 = r6.LJLJL     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L98
            r0.LJFF()     // Catch: java.lang.Throwable -> L18
        L98:
            r6.LJLJI = r2     // Catch: java.lang.Throwable -> L18
            goto L74
        L9b:
            X.9Ok r0 = r6.LJLJL     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto La2
            r0.LJFF()     // Catch: java.lang.Throwable -> L18
        La2:
            X.9Ok r0 = r6.LJLJL     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L18
            r0.LIZLLL()     // Catch: java.lang.Throwable -> L18
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C236079Oh.LJJIFFI():void");
    }

    static {
        C246049lA c246049lA = C246049lA.LJLILLLLZI;
        new C214378bB(C65352Pkq.LIZ(ProfileIconViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C236089Oi.INSTANCE, null, null);
    }

    public C236079Oh() {
        C246049lA c246049lA = C246049lA.LJLILLLLZI;
        C214378bB c214378bB = new C214378bB(C65352Pkq.LIZ(ProfileIconViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(c246049lA, false), C184077Kh.LJLIL, C9MK.INSTANCE, null, null);
        this.LJLILLLLZI = c214378bB;
        C8YN.LJII(this, (AssemViewModel) c214378bB.getValue(), new TBT() { // from class: X.9Oj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Long.valueOf(((C236009Oa) obj).LJLIL);
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 272), 4);
    }

    @Override // X.AbstractC244999jT
    public final BaseTouchPointDataVM LJJ() {
        return (BaseTouchPointDataVM) this.LJLILLLLZI.getValue();
    }

    public final void LJJI(Activity activity, C234529Ii iconNavAction, InterfaceC236109Ok interfaceC236109Ok) {
        o.LJIIIZ(iconNavAction, "iconNavAction");
        this.LJLJJL = activity;
        this.LJLJJLL = iconNavAction;
        this.LJLJL = interfaceC236109Ok;
        if (C2MW.LIZ().LIZLLL(3) != null) {
            LJJIFFI();
        }
    }
}
