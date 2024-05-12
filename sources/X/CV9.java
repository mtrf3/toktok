package X;

import Y.ACListenerS25S0100000_5;
import Y.ACListenerS40S0200000_5;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CV9 extends RecyclerView.ViewHolder {
    public final ImageView LJLIL;
    public final TextView LJLILLLLZI;
    public final ViewGroup LJLJI;
    public final V2J LJLJJI;
    public final C31538CZi LJLJJL;
    public final TextView LJLJJLL;
    public final View LJLJL;
    public final TextView LJLJLJ;

    public CV9(View view) {
        super(view);
        C04D c04d = (C04D) view.findViewById(R.id.ant);
        if (c04d != null) {
            c04d.setViewCompositionStrategy(C283619k.LIZIZ);
        }
        View findViewById = view.findViewById(R.id.my0);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.user_avatar)");
        this.LJLIL = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.mzt);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.user_name)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.elw);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.info_container)");
        this.LJLJI = (ViewGroup) findViewById3;
        View findViewById4 = view.findViewById(R.id.ant);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.border_view)");
        this.LJLJJI = (V2J) findViewById4;
        View findViewById5 = view.findViewById(R.id.l3u);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.text_countdown)");
        this.LJLJJL = (C31538CZi) findViewById5;
        View findViewById6 = view.findViewById(R.id.e2h);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.has_deleted)");
        this.LJLJJLL = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.c65);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.delete)");
        this.LJLJL = findViewById7;
        View findViewById8 = view.findViewById(R.id.l3s);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.text_content)");
        this.LJLJLJ = (TextView) findViewById8;
    }

    public final void N(CVC cvc) {
        List<String> list;
        this.LJLJJL.LIZ(cvc.LJLJJLL, cvc.LJLJJL / 1000);
        if (cvc.LJLJJLL == 20) {
            this.LJLJJI.setGear(EnumC31545CZp.HIGH);
        } else {
            this.LJLJJI.setGear(EnumC31545CZp.LOW);
        }
        BQO LIZ = C15650jR.LIZ();
        ImageModel avatarThumb = cvc.LJLILLLLZI.getAvatarThumb();
        if (avatarThumb != null) {
            list = avatarThumb.getUrls();
        } else {
            list = null;
        }
        C78720Uuy LIZ2 = LIZ.LIZ(list);
        LIZ2.LJIIL = Boolean.TRUE;
        LIZ2.LIZLLL(ImageView.ScaleType.CENTER_CROP);
        int width = this.LJLIL.getWidth();
        int height = this.LJLIL.getHeight();
        LIZ2.LJ = width;
        LIZ2.LJFF = height;
        LIZ2.LJIIIIZZ = R.drawable.d65;
        LIZ2.LJIIJJI(this.LJLIL);
        this.LJLILLLLZI.setText(C05170If.LIZ(cvc.LJLILLLLZI));
        this.LJLJLJ.setText(cvc.LJLJI);
        this.LJLJJLL.setVisibility(8);
        BCG bcg = new BCG(new ACListenerS25S0100000_5(cvc, 395));
        C16880lQ.LJIILLIIL(this.LJLIL, bcg);
        C16880lQ.LJIJI(this.LJLILLLLZI, bcg);
        this.LJLJJI.m44setBackgroundColor8_81llA(C78897Uxp.LIZLLL(351464189));
    }

    public final void L(CVC model, DataChannel dataChannel) {
        o.LJIIIZ(model, "model");
        N(model);
        this.LJLJL.setVisibility(0);
        C16880lQ.LJIIJ(new BCG(new ACListenerS40S0200000_5(model, dataChannel, 79)), this.LJLJL);
        C29306Beo.LJJLIIIJILLIZJL(C15380j0.LIZ(6.0f), this.LJLJI);
        this.LJLJLJ.setVisibility(0);
    }

    public final void M(CVC model, boolean z) {
        Drawable LJI;
        Drawable LJI2;
        o.LJIIIZ(model, "model");
        if (z) {
            if (model.LJLLLL) {
                View view = this.itemView;
                if (CCJ.LIZ(view.getContext())) {
                    LJI2 = C15380j0.LJI(R.drawable.cm7);
                } else {
                    LJI2 = C15380j0.LJI(R.drawable.cm6);
                }
                view.setBackground(LJI2);
                return;
            }
            this.itemView.setBackground(null);
            return;
        }
        N(model);
        this.LJLJL.setVisibility(8);
        if (model.LJLILLLLZI.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            C29306Beo.LJJLIIIJILLIZJL(C15380j0.LIZ(6.0f), this.LJLJI);
            this.LJLJLJ.setVisibility(0);
        } else {
            C29306Beo.LJJLIIIJILLIZJL(C15380j0.LIZ(15.0f), this.LJLJI);
            this.LJLJLJ.setVisibility(8);
        }
        if (model.LJLLLL) {
            View view2 = this.itemView;
            if (CCJ.LIZ(view2.getContext())) {
                LJI = C15380j0.LJI(R.drawable.cm7);
            } else {
                LJI = C15380j0.LJI(R.drawable.cm6);
            }
            view2.setBackground(LJI);
            return;
        }
        this.itemView.setBackground(null);
    }
}
