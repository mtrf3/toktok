package X;

import Y.ACListenerS24S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.login.v2.network.CheckUserNameResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9WE, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9WE extends DialogC26391AXj implements InterfaceC26189APp, InterfaceC228778yP, C9WH {
    public final Activity LJLIL;
    public final User LJLILLLLZI;
    public final C73807Sxv LJLJI;
    public C88393dT LJLJJI;
    public final C9WG LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public EditText LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public boolean LJLLLL;

    @Override // X.InterfaceC26189APp
    public final void Pp0(User user, int i) {
    }

    @Override // X.InterfaceC228778yP
    public final void onHide() {
    }

    @Override // X.InterfaceC228778yP
    public final void onShow() {
    }

    public final TextView LJ() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-positiveButton>(...)");
        return (TextView) value;
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        EditText editText = this.LJLLILLLL;
        if (editText != null) {
            KeyboardUtils.LIZIZ(editText);
        } else {
            o.LJIJI("etUserName");
            throw null;
        }
    }

    @Override // X.C9WH
    public final String LIZ() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC26189APp
    public final void FI(boolean z) {
        if (z) {
            C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
            c26045AKb.LJIIIIZZ(R.string.tnc);
            c26045AKb.LJIIJ();
            C2U8.LIZ(new C9WF());
            this.LJLLL = "save";
            dismiss();
        }
    }

    public final void LJFF(int i) {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-textViewContainer>(...)");
        int i2 = 0;
        ((C74090T5y) ((View) value).findViewById(R.id.eoh)).LIZLLL(i, 0);
        if (i == 0) {
            LJ().setEnabled(false);
            TextView LJ = LJ();
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.gv, context);
            if (LJI != null) {
                i2 = LJI.intValue();
            }
            LJ.setTextColor(i2);
            return;
        }
        LJ().setEnabled(true);
        TextView LJ2 = LJ();
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI2 = C79045V0n.LJI(R.attr.go, context2);
        if (LJI2 != null) {
            i2 = LJI2.intValue();
        }
        LJ2.setTextColor(i2);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        UrlModel urlModel;
        super.onCreate(bundle);
        setContentView(R.layout.bk4);
        this.LJLJJL.bindView(this);
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-textViewContainer>(...)");
        EditText editText = ((C74090T5y) ((View) value).findViewById(R.id.eoh)).getEditText();
        this.LJLLILLLL = editText;
        if (editText != null) {
            editText.setFocusable(true);
            EditText editText2 = this.LJLLILLLL;
            if (editText2 != null) {
                editText2.setFocusableInTouchMode(true);
                EditText editText3 = this.LJLLILLLL;
                if (editText3 != null) {
                    editText3.requestFocus();
                    EditText editText4 = this.LJLLILLLL;
                    if (editText4 != null) {
                        if (editText4 instanceof T5T) {
                            ((T5T) editText4).setTuxFont(41);
                        }
                        Object value2 = this.LJLLI.getValue();
                        o.LJIIIIZZ(value2, "<get-setUsernameRv>(...)");
                        C88393dT c88393dT = new C88393dT((RecyclerView) value2, null, new AqS170S0100000_4(this, 805));
                        this.LJLJJI = c88393dT;
                        c88393dT.LJ = true;
                        C16880lQ.LJIJI(LJ(), new ACListenerS24S0100000_4(this, 193));
                        Object value3 = this.LJLJLLL.getValue();
                        o.LJIIIIZZ(value3, "<get-negativeButton>(...)");
                        C16880lQ.LJIJI((TextView) value3, new ACListenerS24S0100000_4(this, 194));
                        this.LJLJI.LIZ("", new AbstractC73798Sxm<CheckUserNameResponse>() { // from class: X.9W7
                            @Override // X.InterfaceC73740Swq
                            public final void onComplete() {
                            }

                            @Override // X.InterfaceC73740Swq
                            public final void onError(Throwable e) {
                                o.LJIIIZ(e, "e");
                            }

                            @Override // X.InterfaceC73740Swq
                            public final void onNext(Object obj) {
                                List LLJILJILJ;
                                CheckUserNameResponse t = (CheckUserNameResponse) obj;
                                o.LJIIIZ(t, "t");
                                if (t.recommended_unique_ids != null && (!r0.isEmpty())) {
                                    C9WE c9we = C9WE.this;
                                    c9we.getClass();
                                    List<String> list = t.recommended_unique_ids;
                                    if (list != null && (LLJILJILJ = ORZ.LLJILJILJ(ORZ.LJLL(list))) != null && (!LLJILJILJ.isEmpty())) {
                                        EditText editText5 = c9we.LJLLILLLL;
                                        if (editText5 != null) {
                                            editText5.setText((CharSequence) ListProtector.get(LLJILJILJ, 0));
                                            C88393dT c88393dT2 = c9we.LJLJJI;
                                            o.LJI(c88393dT2);
                                            c88393dT2.LIZ(LLJILJILJ.subList(1, LLJILJILJ.size()));
                                            return;
                                        }
                                        o.LJIJI("etUserName");
                                        throw null;
                                    }
                                }
                            }
                        });
                        LJFF(0);
                        Window window = getWindow();
                        if (window != null) {
                            window.setSoftInputMode(37);
                        }
                        setCanceledOnTouchOutside(false);
                        setCancelable(false);
                        User user = this.LJLILLLLZI;
                        if (user != null) {
                            urlModel = user.getAvatarMedium();
                        } else {
                            urlModel = null;
                        }
                        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                        S3I s3i = new S3I();
                        s3i.LIZ = true;
                        LJII.LJIJJLI = new S3L(s3i);
                        Object value4 = this.LJLJJLL.getValue();
                        o.LJIIIIZZ(value4, "<get-ivAvatar>(...)");
                        LJII.LJJIIJ = (SmartImageView) value4;
                        C16880lQ.LLJJJ(LJII);
                        String LIZLLL = AV1.LIZLLL(user);
                        o.LJIIIIZZ(LIZLLL, "getHandle(user)");
                        this.LJLLJ = LIZLLL;
                        Object value5 = this.LJLJL.getValue();
                        o.LJIIIIZZ(value5, "<get-tvUsername>(...)");
                        TextView textView = (TextView) value5;
                        String str = this.LJLLJ;
                        if (str != null) {
                            textView.setText(str);
                            EditText editText5 = this.LJLLILLLL;
                            if (editText5 != null) {
                                editText5.addTextChangedListener(new C90233gR() { // from class: X.9W8
                                    @Override // X.C90233gR, android.text.TextWatcher
                                    public final void afterTextChanged(Editable editable) {
                                        int i;
                                        EditText editText6 = C9WE.this.LJLLILLLL;
                                        if (editText6 != null) {
                                            String obj = editText6.getText().toString();
                                            C9WE c9we = C9WE.this;
                                            if (c9we.LJLLLL) {
                                                c9we.LJLLLL = false;
                                            } else {
                                                C88393dT c88393dT2 = c9we.LJLJJI;
                                                o.LJI(c88393dT2);
                                                c88393dT2.LIZ(null);
                                            }
                                            C9WE c9we2 = C9WE.this;
                                            EditText editText7 = c9we2.LJLLILLLL;
                                            if (editText7 != null) {
                                                Context context = c9we2.getContext();
                                                o.LJIIIIZZ(context, "context");
                                                Integer LJI = C79045V0n.LJI(R.attr.go, context);
                                                if (LJI != null) {
                                                    i = LJI.intValue();
                                                } else {
                                                    i = 0;
                                                }
                                                editText7.setTextColor(i);
                                                if (TextUtils.isEmpty(obj)) {
                                                    C9WE.this.LJFF(0);
                                                    return;
                                                } else {
                                                    C9WE.this.LJFF(1);
                                                    return;
                                                }
                                            }
                                            o.LJIJI("etUserName");
                                            throw null;
                                        }
                                        o.LJIJI("etUserName");
                                        throw null;
                                    }
                                });
                                return;
                            } else {
                                o.LJIJI("etUserName");
                                throw null;
                            }
                        }
                        o.LJIJI("currentUserName");
                        throw null;
                    }
                    o.LJIJI("etUserName");
                    throw null;
                }
                o.LJIJI("etUserName");
                throw null;
            }
            o.LJIJI("etUserName");
            throw null;
        }
        o.LJIJI("etUserName");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9WE(Activity activity, User user) {
        super(activity, R.style.ho, true, false, false);
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = user;
        this.LJLJI = new C73807Sxv();
        this.LJLJJL = ProfileServiceImpl.LIZ().newUserPresenter();
        this.LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 894));
        this.LJLJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 899));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 898));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 895));
        this.LJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 896));
        this.LJLLI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 897));
        this.LJLLL = "background";
    }

    @Override // X.InterfaceC26189APp
    public final void Xa(Exception exc, int i) {
        if (exc != null) {
            if ((exc instanceof ExecutionException) && (exc.getCause() instanceof C38333F2r)) {
                Throwable cause = exc.getCause();
                o.LJII(cause, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
                exc = (Exception) cause;
            }
            if (exc instanceof C38333F2r) {
                IProfileService LIZ = ProfileServiceImpl.LIZ();
                C38333F2r c38333F2r = (C38333F2r) exc;
                String valueOf = String.valueOf(c38333F2r.getErrorCode());
                String errorMsg = c38333F2r.getErrorMsg();
                o.LJIIIIZZ(errorMsg, "exception.errorMsg");
                String str = this.LJLLJ;
                if (str != null) {
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    LIZ.checkIDNet(valueOf, errorMsg, str, context);
                    return;
                }
                o.LJIJI("currentUserName");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC26189APp
    public final void vb0(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LJIIJ();
    }
}
