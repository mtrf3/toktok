package X;

import Y.ACListenerS34S0100000_14;
import Y.AObjectS89S0100000_14;
import Y.IDObjectS185S0100000_14;
import Y.IDTListenerS122S0100000_14;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.EditText;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.WoF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83399WoF extends AbstractC29891Fh<InterfaceC82134WLi> implements InterfaceC135635Tz, InterfaceC82134WLi {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLJ;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public InterfaceC83402WoI LJLJJI;
    public InterfaceC83370Wnm LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final C29901Fi<String> LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public final C5H3 LJLLI;
    public final C83404WoK LJLLILLLL;

    static {
        TBT tbt = new TBT(C83399WoF.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLJ = new InterfaceC74236TBo[]{tbt};
    }

    public InterfaceC82134WLi LJJLI() {
        return this;
    }

    public final C83378Wnu LJJLIIIIJ() {
        return (C83378Wnu) this.LJLLI.getValue();
    }

    public final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLJJLL.LIZ(this, LJLLJ[0]);
    }

    @Override // X.InterfaceC82134WLi
    public void hide() {
        this.LJLILLLLZI.hide(LJJLIIIIJ());
    }

    @Override // X.InterfaceC82134WLi
    public void show() {
        this.LJLILLLLZI.show(LJJLIIIIJ());
    }

    private final void LJJLIIIJILLIZJL() {
        C0IB<Boolean> Ve0;
        C16880lQ.LJJJ(LJJLIIIIJ().LLJILJILJ(), new ACListenerS34S0100000_14(this, 9));
        View view = LJJLIIIIJ().LJLJI;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 10), view);
            if (C19N.LJ("action_ai_enable_debug_mode", false)) {
                View view2 = LJJLIIIIJ().LJLJI;
                if (view2 != null) {
                    view2.setOnLongClickListener(new ViewOnLongClickListenerC83401WoH(this));
                } else {
                    o.LJIJI("hideBtn");
                    throw null;
                }
            }
            InterfaceC83370Wnm interfaceC83370Wnm = this.LJLJJL;
            if (interfaceC83370Wnm != null && (Ve0 = interfaceC83370Wnm.Ve0()) != null) {
                Ve0.LIZIZ(this, new AObjectS89S0100000_14(this, 20));
            }
            LJJLIIIIJ().LLJILJILJ().setVisibility(8);
            LJJLIIIIJ().LLJILJIL().setFilters(new C224858s5[]{new InputFilter() { // from class: X.8s5
                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence source, int i, int i2, Spanned dest, int i3, int i4) {
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(dest, "dest");
                    int length = 6000 - (dest.length() - (i4 - i3));
                    if (length <= 0) {
                        return "";
                    }
                    if (length >= i2 - i) {
                        return null;
                    }
                    int i5 = length + i;
                    int i6 = i5 - 1;
                    if (Character.isHighSurrogate(source.charAt(i6))) {
                        if (i6 == i) {
                            return "";
                        }
                        i5 = i6;
                    }
                    return source.subSequence(i, i5);
                }
            }});
            LJJLIIIIJ().LLJILJIL().setOnTouchListener(new IDTListenerS122S0100000_14(this, 1));
            LJJLIIIIJ().LLJILJIL().addTextChangedListener(new IDObjectS185S0100000_14(this, 2));
            LJJLIIIIJ().LLJILJIL().setOnFocusChangeListener(new ViewOnFocusChangeListenerC83400WoG(this));
            return;
        }
        o.LJIJI("hideBtn");
        throw null;
    }

    @Override // X.InterfaceC82134WLi
    public EditText Ec() {
        return LJJLIIIIJ().LLJILJIL();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        this.LJLILLLLZI.add(this.LJLJI, LJJLIIIIJ(), "ActionAIInputScene");
        this.LJLJJI = (InterfaceC83402WoI) getDiContainer().LJIIIIZZ(null, InterfaceC83402WoI.class);
        this.LJLJJL = (InterfaceC83370Wnm) getDiContainer().LJIIIIZZ(null, InterfaceC83370Wnm.class);
        InterfaceC83402WoI interfaceC83402WoI = this.LJLJJI;
        if (interfaceC83402WoI != null) {
            interfaceC83402WoI.wL(this.LJLLILLLL);
        }
        LJJLIIIJILLIZJL();
    }

    @Override // X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
        LJJLIIIIJ().LLJILJIL().clearFocus();
    }

    @Override // X.InterfaceC82134WLi
    public LiveEvent<String> Ld() {
        return this.LJLJL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC82134WLi getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public final void LJJLIIIJJI(String message) {
        o.LJIIIZ(message, "message");
        this.LJLJL.LJII(message);
    }

    @Override // X.InterfaceC82134WLi
    public void cl(boolean z, boolean z2) {
        C0IB<Boolean> Ve0;
        if (z) {
            InterfaceC83370Wnm interfaceC83370Wnm = this.LJLJJL;
            if (interfaceC83370Wnm != null && (Ve0 = interfaceC83370Wnm.Ve0()) != null && o.LJ(Ve0.LIZ(), Boolean.TRUE)) {
                return;
            }
            if (this.LJLJLLL) {
                LJJLIIIIJ().LLJILJILJ().setVisibility(0);
            }
            View view = LJJLIIIIJ().LJLJJI;
            if (view != null) {
                view.setAlpha(1.0f);
                LJJLIIIIJ().LLJILJIL().setFocusable(true);
                LJJLIIIIJ().LLJILJIL().setFocusableInTouchMode(true);
                LJJLIIIIJ().LLJILJIL().setCursorVisible(true);
                LJJLIIIIJ().LLJILJIL().setEnabled(true);
                if (z2) {
                    LJJLIIIIJ().LLJILJIL().requestFocus();
                    return;
                }
                return;
            }
            o.LJIJI("inputEditTextContainer");
            throw null;
        }
        LJJLIIIIJ().LLJILJILJ().setVisibility(8);
        View view2 = LJJLIIIIJ().LJLJJI;
        if (view2 != null) {
            view2.setAlpha(0.34f);
            LJJLIIIIJ().LLJILJIL().setFocusable(false);
            LJJLIIIIJ().LLJILJIL().setFocusableInTouchMode(false);
            LJJLIIIIJ().LLJILJIL().setCursorVisible(false);
            LJJLIIIIJ().LLJILJIL().setEnabled(false);
            return;
        }
        o.LJIJI("inputEditTextContainer");
        throw null;
    }

    public C83399WoF(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJL = new C29901Fi<>();
        this.LJLLI = C221108m2.LIZIZ(C83406WoM.LJLIL);
        this.LJLLILLLL = new C83404WoK(this);
    }
}
