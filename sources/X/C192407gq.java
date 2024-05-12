package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.7gq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192407gq extends AbstractC208468Gc {
    public final TextView LJLJLJ;
    public final CheckBox LJLJLLL;
    public final View LJLL;
    public final View LJLLI;
    public final View LJLLILLLL;
    public final ViewGroup LJLLJ;
    public final InterfaceC207258Bl LJLLL;
    public final /* synthetic */ CollectionContentAssem LJLLLL;

    @Override // X.MFR
    public final void LLZLLLL() {
        Video video;
        Aweme aweme = this.LJLIL;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            if (U(video, "AbsAwemeViewHolder")) {
                this.LJLJI = true;
            } else {
                T(video.getCover(), "AbsAwemeViewHolder", null, null);
            }
        }
    }

    @Override // X.AbstractC208468Gc
    public final int[] P() {
        return J7H.LIZ(200);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C192407gq(CollectionContentAssem collectionContentAssem, ViewGroup parent) {
        super(C28289B8j.LIZ(parent, R.layout.ava, parent, false));
        o.LJIIIZ(parent, "parent");
        this.LJLLLL = collectionContentAssem;
        View findViewById = this.itemView.findViewById(R.id.lih);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.total)");
        this.LJLJLJ = (TextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.jm_);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.selected)");
        this.LJLJLLL = (CheckBox) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.jmr);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.selected_view)");
        this.LJLL = findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.ca9);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.….disable_unselected_mask)");
        this.LJLLI = findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.bxx);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.cover_mask)");
        this.LJLLILLLL = findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.eh3);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.image_frame)");
        ViewGroup viewGroup = (ViewGroup) findViewById6;
        this.LJLLJ = viewGroup;
        InterfaceC207258Bl LJI = C8SG.LIZIZ.LJI(viewGroup);
        this.LJLLL = LJI;
        LJI.LIZ(findViewById3);
        this.LJLILLLLZI = (SmartImageView) this.itemView.findViewById(R.id.cover);
        if (e1.LIZ(31744, "stop_main_anim_when_invisible", true, false)) {
            this.LJLILLLLZI.setAnimationListener(this.LJLJL);
        }
    }
}
