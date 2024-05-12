package X;

import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Sid, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72859Sid implements InterfaceC72860Sie {
    public LinearLayout LJLIL;
    public W5G LJLILLLLZI;
    public C8HN LJLJI;
    public W5G LJLJJI;
    public LinearLayout LJLJJL;
    public final boolean LJLJJLL;

    @Override // X.InterfaceC72860Sie
    public final void LIZ() {
        LinearLayout linearLayout = this.LJLIL;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    @Override // X.InterfaceC72860Sie
    public final EnumC72858Sic priority() {
        return EnumC72858Sic.NormalStickerInfoHandlerPriority;
    }

    public C72859Sid(boolean z) {
        this.LJLJJLL = z;
    }

    @Override // X.InterfaceC72860Sie
    public final void LIZJ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        LinearLayout linearLayout = (LinearLayout) stickerView.findViewById(R.id.fme);
        this.LJLIL = linearLayout;
        if (this.LJLJJLL) {
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            this.LJLILLLLZI = (W5G) stickerView.findViewById(R.id.ki0);
            this.LJLJI = (C8HN) stickerView.findViewById(R.id.kik);
            this.LJLJJI = (W5G) stickerView.findViewById(R.id.h05);
            this.LJLJJL = (LinearLayout) stickerView.findViewById(R.id.gzp);
            return;
        }
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override // X.InterfaceC72860Sie
    public final boolean LIZIZ(T4Q session, InterfaceC72857Sib interfaceC72857Sib) {
        String str;
        List<String> urlList;
        o.LJIIIZ(session, "session");
        Effect effect = session.LIZ;
        if (effect != null && ((effect.getSource() == 0 || effect.getSource() == 101 || effect.getSource() == 102) && this.LJLJJLL)) {
            LinearLayout linearLayout = this.LJLJJL;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            W5G w5g = this.LJLJJI;
            if (w5g != null) {
                w5g.setVisibility(8);
            }
            W5G w5g2 = this.LJLILLLLZI;
            if (w5g2 != null) {
                w5g2.setVisibility(0);
            }
            C8HN c8hn = this.LJLJI;
            if (c8hn != null) {
                c8hn.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.LJLIL;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            W5G w5g3 = this.LJLILLLLZI;
            if (w5g3 != null) {
                UrlModel iconUrl = effect.getIconUrl();
                if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null) {
                    str = (String) ORZ.LJLLLL(urlList);
                } else {
                    str = null;
                }
                C78764Uvg.LJIIIZ(w5g3, str, -1, -1);
            }
            C8HN c8hn2 = this.LJLJI;
            if (c8hn2 == null) {
                return true;
            }
            c8hn2.setText(effect.getName());
            return true;
        }
        LIZ();
        return false;
    }
}
