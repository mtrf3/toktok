package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3iw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class EnumC91783iw {
    public static final EnumC91783iw ADD_MEMBER;
    public static final EnumC91783iw CREATE_GROUP;
    public static final /* synthetic */ EnumC91783iw[] LJLIL;

    public EnumC91783iw() {
        throw null;
    }

    public static EnumC91783iw valueOf(String str) {
        return (EnumC91783iw) V0N.LJJJ(EnumC91783iw.class, str);
    }

    public static EnumC91783iw[] values() {
        return (EnumC91783iw[]) LJLIL.clone();
    }

    public abstract boolean getShowJoinedGroupsHeader();

    public abstract String sendBtnText(int i);

    static {
        EnumC91783iw enumC91783iw = new EnumC91783iw() { // from class: X.3lE
            public final boolean LJLILLLLZI = true;

            @Override // X.EnumC91783iw
            public final boolean getShowJoinedGroupsHeader() {
                return this.LJLILLLLZI;
            }

            @Override // X.EnumC91783iw
            public final String sendBtnText(int i) {
                String string;
                if (i < 2) {
                    string = EF7.LIZIZ().getString(R.string.gx0);
                } else {
                    string = EF7.LIZIZ().getString(R.string.gx2, Integer.valueOf(i));
                }
                o.LJIIIIZZ(string, "if (selectedNum < 2) con…_group_chat, selectedNum)");
                return string;
            }

            @Override // X.EnumC91783iw
            public final void setupTitleBar(C101043xs titleBar, final AmeBaseFragment fragment) {
                o.LJIIIZ(titleBar, "titleBar");
                o.LJIIIZ(fragment, "fragment");
                super.setupTitleBar(titleBar, fragment);
                titleBar.setTitle(R.string.dym);
                titleBar.setLeftText(R.string.h4j);
                titleBar.setOnTitlebarClickListener(new InterfaceC101063xu() { // from class: X.3lF
                    @Override // X.InterfaceC101063xu
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC101063xu
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC101063xu
                    public final void LIZJ(int i) {
                    }

                    @Override // X.InterfaceC101063xu
                    public final void LIZLLL() {
                    }

                    @Override // X.InterfaceC101063xu
                    public final void LJ() {
                        C93203lE c93203lE = C93203lE.this;
                        AmeBaseFragment ameBaseFragment = fragment;
                        c93203lE.getClass();
                        EnumC91783iw.LIZJ(ameBaseFragment);
                    }
                });
            }
        };
        CREATE_GROUP = enumC91783iw;
        EnumC91783iw enumC91783iw2 = new EnumC91783iw() { // from class: X.3lH
            @Override // X.EnumC91783iw
            public final boolean getShowJoinedGroupsHeader() {
                return false;
            }

            @Override // X.EnumC91783iw
            public final String sendBtnText(int i) {
                String string;
                if (i < 2) {
                    string = EF7.LIZIZ().getString(R.string.gx3);
                } else {
                    string = EF7.LIZIZ().getString(R.string.gx4, Integer.valueOf(i));
                }
                o.LJIIIIZZ(string, "if (selectedNum < 2) con…done_number, selectedNum)");
                return string;
            }

            @Override // X.EnumC91783iw
            public final void setupTitleBar(C101043xs titleBar, final AmeBaseFragment fragment) {
                o.LJIIIZ(titleBar, "titleBar");
                o.LJIIIZ(fragment, "fragment");
                super.setupTitleBar(titleBar, fragment);
                titleBar.setTitle(R.string.guy);
                titleBar.setLeftText("");
                titleBar.setRightIcon(new C95063oE(R.raw.icon_x_mark_small, R.string.dfz));
                titleBar.setOnTitlebarClickListener(new InterfaceC101063xu() { // from class: X.3lG
                    @Override // X.InterfaceC101063xu
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC101063xu
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC101063xu
                    public final void LIZLLL() {
                    }

                    @Override // X.InterfaceC101063xu
                    public final void LJ() {
                    }

                    @Override // X.InterfaceC101063xu
                    public final void LIZJ(int i) {
                        C93233lH c93233lH = C93233lH.this;
                        AmeBaseFragment ameBaseFragment = fragment;
                        c93233lH.getClass();
                        EnumC91783iw.LIZJ(ameBaseFragment);
                    }
                });
            }
        };
        ADD_MEMBER = enumC91783iw2;
        LJLIL = new EnumC91783iw[]{enumC91783iw, enumC91783iw2};
    }

    public static void LIZJ(AmeBaseFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager != null) {
            new C1B3(fragmentManager).LJJI(fragment);
        }
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.onBackPressed();
        }
    }

    public void setupTitleBar(C101043xs titleBar, AmeBaseFragment fragment) {
        o.LJIIIZ(titleBar, "titleBar");
        o.LJIIIZ(fragment, "fragment");
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null) {
            C4NO.LIZ(mo49getActivity);
        }
    }

    public EnumC91783iw(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
