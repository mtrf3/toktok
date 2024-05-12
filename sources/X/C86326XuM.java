package X;

import Y.ACListenerS19S1300000_15;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.MaskLayer;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XuM, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86326XuM extends RelativeLayout {
    public final View LJLIL;
    public final TextView LJLILLLLZI;
    public final TextView LJLJI;
    public final SY4 LJLJJI;
    public final SY4 LJLJJL;
    public final SmartImageView LJLJJLL;
    public boolean LJLJL;
    public InterfaceC86327XuN LJLJLJ;

    public final void setClickWatchLive(boolean z) {
    }

    private final void setRadioCover(LiveRoomStruct liveRoomStruct) {
        String str;
        UrlModel avatarLarger;
        List<String> urlList;
        User user = liveRoomStruct.owner;
        if (user == null || (avatarLarger = user.getAvatarLarger()) == null || (urlList = avatarLarger.getUrlList()) == null || (str = (String) ListProtector.get(urlList, 0)) == null) {
            str = "";
        }
        if (str.length() > 0) {
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
            LJIIIIZZ.LJIL = new MHO(25);
            LJIIIIZZ.LJIJI = Bitmap.Config.ARGB_8888;
            LJIIIIZZ.LJJIIJ = this.LJLJJLL;
            C16880lQ.LLJJJ(LJIIIIZZ);
        }
    }

    public final void setClickSkip(boolean z) {
        this.LJLJL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86326XuM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        View inflate = View.inflate(context, R.layout.afn, this);
        o.LJIIIIZZ(inflate, "inflate(context, R.layou…_widget_mask_layer, this)");
        this.LJLIL = inflate;
        View findViewById = inflate.findViewById(R.id.d85);
        o.LJIIIIZZ(findViewById, "viewRoot.findViewById(R.…mask_layer_tip_title_txt)");
        this.LJLILLLLZI = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.d83);
        o.LJIIIIZZ(findViewById2, "viewRoot.findViewById(R.…sk_layer_tip_content_txt)");
        this.LJLJI = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.d86);
        o.LJIIIIZZ(findViewById3, "viewRoot.findViewById(R.…ask_layer_watch_live_btn)");
        this.LJLJJI = (SY4) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.d82);
        o.LJIIIIZZ(findViewById4, "viewRoot.findViewById(R.…mask_layer_skip_live_btn)");
        this.LJLJJL = (SY4) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.e66);
        o.LJIIIIZZ(findViewById5, "viewRoot.findViewById(R.…d_mask_layer_radio_cover)");
        this.LJLJJLL = (SmartImageView) findViewById5;
    }

    public final void LIZ(LiveRoomStruct liveRoomStruct, String str) {
        MaskLayer maskLayer;
        if (liveRoomStruct == null || (maskLayer = liveRoomStruct.maskLayer) == null) {
            return;
        }
        C85880XnA.LIZ(this.LJLILLLLZI, maskLayer.getTitle());
        C85880XnA.LIZ(this.LJLJI, maskLayer.getSubTitle());
        View findViewById = this.LJLIL.findViewById(R.id.d84);
        o.LJIIIIZZ(findViewById, "viewRoot.findViewById(R.….feed_mask_layer_tip_img)");
        ((AppCompatImageView) findViewById).setImageResource(R.drawable.aij);
        C16880lQ.LJJIZ(this.LJLJJI, new ACListenerS19S1300000_15(this, maskLayer, liveRoomStruct, str, 0));
        C16880lQ.LJJIZ(this.LJLJJL, new ACListenerS19S1300000_15(this, maskLayer, liveRoomStruct, str, 1));
        setRadioCover(liveRoomStruct);
    }
}
