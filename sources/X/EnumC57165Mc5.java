package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Mc5 */
/* loaded from: classes10.dex */
public abstract class EnumC57165Mc5 extends Enum<EnumC57165Mc5> {
    public static final EnumC57165Mc5 CONTACTS;
    public static final C57169Mc9 Companion;
    public static final /* synthetic */ EnumC57165Mc5[] LJLJI;
    public static final C5H3<String> REPO_PREFIX$delegate;
    public final String LJLIL;
    public C57166Mc6 LJLILLLLZI;

    public EnumC57165Mc5() {
        throw null;
    }

    public static EnumC57165Mc5 valueOf(String str) {
        return (EnumC57165Mc5) V0N.LJJJ(EnumC57165Mc5.class, str);
    }

    public static EnumC57165Mc5[] values() {
        return (EnumC57165Mc5[]) LJLJI.clone();
    }

    public abstract EnumC56648MLc decideDisplay(Context context, Fragment fragment);

    static {
        EnumC57165Mc5 enumC57165Mc5 = new EnumC57165Mc5() { // from class: X.Mc4
            /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
            
                if (r1 == 0) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
            
                if ((r10 instanceof X.InterfaceC55058LjC) != false) goto L16;
             */
            @Override // X.EnumC57165Mc5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.EnumC56648MLc decideDisplay(android.content.Context r10, androidx.fragment.app.Fragment r11) {
                /*
                    r9 = this;
                    r4 = 0
                    if (r10 == 0) goto L25
                    boolean r0 = X.AX6.LIZIZ()
                    if (r0 == 0) goto L21
                    com.bytedance.router.fragment.FindNavigationContainerResult r0 = com.bytedance.router.fragment.NavigationUtils.findNavigationContainer(r11)
                    if (r0 != 0) goto L12
                Lf:
                    X.MLc r3 = X.EnumC56648MLc.GONE
                L11:
                    return r3
                L12:
                    androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
                    int r1 = r0.LJJJJIZL()
                    boolean r0 = r10 instanceof X.InterfaceC55058LjC
                    if (r0 == 0) goto Lf
                    if (r1 != 0) goto Lf
                    goto L25
                L21:
                    boolean r0 = r10 instanceof X.InterfaceC55058LjC
                    if (r0 == 0) goto Lf
                L25:
                    X.Ol8 r0 = X.INB.LJ
                    java.lang.Object r0 = r0.getValue()
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto Lf
                    X.UUc r0 = X.C77266UUc.LIZIZ
                    X.Mfn r0 = r0.LJIILLIIL()
                    boolean r0 = r0.LIZJ()
                    if (r0 != 0) goto Lf
                    X.Mc6 r2 = r9.LIZJ()
                    X.Ol8 r0 = X.C57167Mc7.LIZIZ
                    java.lang.Object r3 = r0.getValue()
                    com.ss.android.ugc.aweme.inbox.InboxInvitationCellMeta r3 = (com.ss.android.ugc.aweme.inbox.InboxInvitationCellMeta) r3
                    com.bytedance.keva.Keva r6 = r2.LIZIZ()
                    java.lang.String r0 = "del_time_"
                    java.lang.String r5 = r2.LIZ(r0)
                    r0 = 0
                    long r0 = r6.getLong(r5, r0)
                    long r7 = java.lang.System.currentTimeMillis()
                    long r7 = r7 - r0
                    int r0 = r3.hideDays
                    long r5 = (long) r0
                    r0 = 86400000(0x5265c00, double:4.2687272E-316)
                    long r5 = r5 * r0
                    int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                    if (r0 >= 0) goto L79
                    X.MLc r3 = X.EnumC56648MLc.GONE
                L6d:
                    X.MLc r1 = X.EnumC56648MLc.GONE
                    if (r3 == r1) goto Lb9
                    X.MLc r0 = r2.LIZLLL
                    if (r0 == r1) goto Lb9
                    if (r3 == r0) goto Lb9
                    r3 = r0
                    goto L11
                L79:
                    com.bytedance.keva.Keva r1 = r2.LIZIZ()
                    java.lang.String r0 = "del_times_"
                    java.lang.String r0 = r2.LIZ(r0)
                    int r1 = r1.getInt(r0, r4)
                    int r0 = r3.maxDeleteTimes
                    if (r1 < r0) goto L8e
                    X.MLc r3 = X.EnumC56648MLc.GONE
                    goto L6d
                L8e:
                    com.bytedance.keva.Keva r1 = r2.LIZIZ()
                    java.lang.String r0 = "bottom_by_del_"
                    java.lang.String r0 = r2.LIZ(r0)
                    boolean r0 = r1.getBoolean(r0, r4)
                    if (r0 == 0) goto La1
                    X.MLc r3 = X.EnumC56648MLc.BOTTOM
                    goto L6d
                La1:
                    com.bytedance.keva.Keva r1 = r2.LIZIZ()
                    java.lang.String r0 = "enter_inbox_times_"
                    java.lang.String r0 = r2.LIZ(r0)
                    int r1 = r1.getInt(r0, r4)
                    int r0 = r3.maxNoActionTimes
                    if (r1 <= r0) goto Lb6
                    X.MLc r3 = X.EnumC56648MLc.BOTTOM
                    goto L6d
                Lb6:
                    X.MLc r3 = X.EnumC56648MLc.TOP
                    goto L6d
                Lb9:
                    r2.LIZLLL = r3
                    goto L11
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C57164Mc4.decideDisplay(android.content.Context, androidx.fragment.app.Fragment):X.MLc");
            }
        };
        CONTACTS = enumC57165Mc5;
        LJLJI = new EnumC57165Mc5[]{enumC57165Mc5};
        Companion = new C57169Mc9();
        REPO_PREFIX$delegate = C221108m2.LIZIZ(IN9.LJLIL);
    }

    public final void markEnterInbox() {
        C114304eA.LIZIZ(new AqS159S0100000_9(this, 856));
    }

    public final C57166Mc6 LIZJ() {
        String str;
        User curUser = HG3.LJIILL().getCurUser();
        String str2 = null;
        if (curUser == null || (str = curUser.getUid()) == null) {
            str = "";
        }
        C57166Mc6 c57166Mc6 = this.LJLILLLLZI;
        if (c57166Mc6 != null) {
            str2 = c57166Mc6.LIZIZ;
        }
        if (!o.LJ(str2, str)) {
            this.LJLILLLLZI = new C57166Mc6(this, str);
        }
        C57166Mc6 c57166Mc62 = this.LJLILLLLZI;
        o.LJI(c57166Mc62);
        return c57166Mc62;
    }

    public final void markAction() {
        C57166Mc6 LIZJ = LIZJ();
        LIZJ.LIZIZ().storeInt(LIZJ.LIZ("enter_inbox_times_"), 0);
        LIZJ.LIZIZ().storeBoolean(LIZJ.LIZ("bottom_by_del_"), false);
    }

    public final void markDelete() {
        C57166Mc6 LIZJ = LIZJ();
        LIZJ.LIZIZ().storeLong(LIZJ.LIZ("del_time_"), System.currentTimeMillis());
        String LIZ = LIZJ.LIZ("del_times_");
        LIZJ.LIZIZ().storeInt(LIZ, LIZJ.LIZIZ().getInt(LIZ, 0) + 1);
        LIZJ.LIZIZ().storeBoolean(LIZJ.LIZ("bottom_by_del_"), true);
    }

    public final String getKey() {
        return this.LJLIL;
    }

    public final String asRepoKey(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(this.LJLIL);
        return X1D.LIZIZ(LIZ);
    }

    public EnumC57165Mc5(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        super(str, i);
        this.LJLIL = str2;
    }

    public static /* synthetic */ EnumC56648MLc decideDisplay$default(EnumC57165Mc5 enumC57165Mc5, Context context, Fragment fragment, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                context = null;
            }
            if ((i & 2) != 0) {
                fragment = null;
            }
            return enumC57165Mc5.decideDisplay(context, fragment);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decideDisplay");
    }
}
