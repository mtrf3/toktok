package X;

import Y.ACListenerS35S0100000_15;
import Y.ARunnableS51S0100000_15;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xm1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85809Xm1 extends C85814Xm6 {
    public static final /* synthetic */ int LJLJLLL = 0;
    public C74088T5w LJLJJLL;
    public ImageView LJLJL;
    public String LJLJLJ;

    @Override // X.C85814Xm6
    public final View LIZJ() {
        if (this.LJLIL.getLayoutResource() <= 0) {
            this.LJLIL.setLayoutResource(R.layout.nq);
        }
        View view = this.LJLIL.inflate();
        o.LJIIIIZZ(view, "view");
        View findViewById = view.findViewById(R.id.g9a);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.lobby_authenticator_image)");
        this.LJLJL = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.g9_);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.lobby_authenticator_button)");
        C74088T5w c74088T5w = (C74088T5w) findViewById2;
        this.LJLJJLL = c74088T5w;
        C7FC.LIZIZ(c74088T5w);
        C74088T5w c74088T5w2 = this.LJLJJLL;
        if (c74088T5w2 != null) {
            c74088T5w2.setEnabled(false);
            C74088T5w c74088T5w3 = this.LJLJJLL;
            if (c74088T5w3 != null) {
                c74088T5w3.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS35S0100000_15(this, 256)));
                if (this.LJLJJI == null) {
                    LIZLLL(null, "JSON is empty");
                } else {
                    C82544WaS.LIZ(new ARunnableS51S0100000_15(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
                }
                return view;
            }
            o.LJIJI("verifyButton");
            throw null;
        }
        o.LJIJI("verifyButton");
        throw null;
    }

    public final void LIZLLL(Integer num, String str) {
        C74088T5w c74088T5w = this.LJLJJLL;
        if (c74088T5w != null) {
            c74088T5w.LIZ(true);
            String LIZIZ = LIZIZ(num, str);
            C5S1 c5s1 = new C5S1(LIZ());
            c5s1.LIZLLL(LIZIZ);
            c5s1.LJ();
            InterfaceC85818XmA interfaceC85818XmA = this.LJLILLLLZI;
            if (interfaceC85818XmA != null) {
                interfaceC85818XmA.LJJLL();
                return;
            }
            return;
        }
        o.LJIJI("verifyButton");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85809Xm1(C29S activity, ViewStub viewStub, InterfaceC85818XmA authCallback) {
        super(activity, viewStub, authCallback);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(authCallback, "authCallback");
    }
}
