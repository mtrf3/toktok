package X;

import Y.ACListenerS42S0200000_7;
import Y.ARunnableS18S0300000_7;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.views.IDlS18S0200000_7;
import com.ss.android.vesdk.VEMediaParser;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.HNs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43976HNs extends RecyclerView.ViewHolder {
    public final ViewGroup LJLIL;
    public final Integer LJLILLLLZI;
    public final C72559Sdn LJLJI;
    public final W5G LJLJJI;
    public final View LJLJJL;
    public final TuxTextView LJLJJLL;
    public final TuxIconView LJLJL;
    public final View LJLJLJ;
    public final View LJLJLLL;
    public final View LJLL;
    public final View LJLLI;
    public final FrameLayout LJLLILLLL;
    public final ImageView LJLLJ;
    public final View LJLLL;
    public final View LJLLLL;
    public final int LJLLLLLL;
    public int LJLZ;
    public final /* synthetic */ AbstractC43973HNp LJZ;

    public /* synthetic */ C43976HNs() {
        throw null;
    }

    public void N(ViewGroup parent) {
        int i;
        double d;
        double d2;
        o.LJIIIZ(parent, "parent");
        if (HOC.LIZJ()) {
            d = this.LJLLLLLL;
            d2 = 1.3333333333333333d;
        } else if (HOC.LIZLLL()) {
            d = this.LJLLLLLL;
            d2 = 1.7777777777777777d;
        } else {
            i = this.LJLLLLLL;
            this.LJLZ = i;
            P(i, this.LJLLLLLL, parent);
        }
        i = (int) (d / d2);
        this.LJLZ = i;
        P(i, this.LJLLLLLL, parent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void M(MyMediaModel mediaModel, C43976HNs holder) {
        REQUEST request;
        V92 hierarchy;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        V92 hierarchy2;
        V92 hierarchy3;
        o.LJIIIZ(mediaModel, "mediaModel");
        o.LJIIIZ(holder, "holder");
        if (!HOC.LIZLLL()) {
            HOC.LIZJ();
        }
        W5G w5g = holder.LJLJJI;
        InterfaceC81252Vui interfaceC81252Vui = null;
        if (w5g != null && (hierarchy3 = w5g.getHierarchy()) != null) {
            V8L v8l = new V8L();
            v8l.LJFF(C32151Nz.LJIIZILJ(Float.valueOf(this.LJZ.LL())));
            hierarchy3.LJIL(v8l);
        }
        if (mediaModel.libraryState != null) {
            Integer num = this.LJLILLLLZI;
            if (num != null) {
                AbstractC43973HNp abstractC43973HNp = this.LJZ;
                int intValue = num.intValue();
                W5G w5g2 = holder.LJLJJI;
                if (w5g2 != null && (hierarchy2 = w5g2.getHierarchy()) != null) {
                    V8L v8l2 = new V8L();
                    v8l2.LJI(C04330Ez.LIZIZ(this.LJLIL.getContext(), intValue));
                    v8l2.LJFF(C32151Nz.LJIIZILJ(Float.valueOf(abstractC43973HNp.LL())));
                    hierarchy2.LJIL(v8l2);
                }
            }
            String str = mediaModel.thumbnail;
            if (str != null && str.length() > 0) {
                C170676mt.LIZIZ(holder.LJLJJI, str, Bitmap.Config.ARGB_8888);
                return;
            }
            return;
        }
        if (HOA.LIZ() && (interfaceC65784Pro = this.LJZ.LJLJLJ) != null && interfaceC65784Pro.invoke().booleanValue() && mediaModel.LJI() && C79057V0z.LJJIJ(mediaModel)) {
            VEMediaParser vEMediaParser = new VEMediaParser();
            vEMediaParser.init(mediaModel.fileLocalUriPath);
            holder.itemView.post(new ARunnableS18S0300000_7(holder, mediaModel, vEMediaParser, 0));
            return;
        }
        AbstractC43973HNp abstractC43973HNp2 = this.LJZ;
        android.net.Uri LJIIIIZZ = C44694HgQ.LJIIIIZZ(mediaModel.fileLocalUriPath);
        abstractC43973HNp2.getClass();
        W5P LIZLLL = W5P.LIZLLL(LJIIIIZZ);
        if (e1.LIZ(31744, "studio_set_auto_rotation_options", true, true)) {
            LIZLLL.LIZLLL = V85.LJ;
        }
        if (HOC.LIZIZ()) {
            request = LIZLLL.LIZ();
        } else {
            LIZLLL.LIZJ = new C79238V7y(SFS.LJI(56.0d), SFS.LJI(56.0d));
            request = LIZLLL.LIZ();
        }
        C81705W4v LIZJ = W5I.LIZJ();
        W5G w5g3 = holder.LJLJJI;
        if (w5g3 != null) {
            interfaceC81252Vui = w5g3.getController();
        }
        LIZJ.LJIIL = interfaceC81252Vui;
        LIZJ.LIZLLL = request;
        W4R LIZ = LIZJ.LIZ();
        if (HOC.LIZIZ()) {
            C79077V1t c79077V1t = new C79077V1t(holder.itemView.getContext().getResources());
            c79077V1t.LJIIJ = InterfaceC78716Uuu.LJJLIIIJILLIZJL;
            c79077V1t.LJIILL = abstractC43973HNp2.LLFF(holder);
            LIZ.LIZIZ(c79077V1t.LIZ());
        }
        W5G w5g4 = holder.LJLJJI;
        if (w5g4 != null) {
            w5g4.setController(LIZ);
        }
        W5G w5g5 = holder.LJLJJI;
        if (w5g5 == null || (hierarchy = w5g5.getHierarchy()) == null) {
            return;
        }
        hierarchy.LJIJ(abstractC43973HNp2.LLFII());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43976HNs(AbstractC43973HNp abstractC43973HNp, ViewGroup parent, Integer num) {
        super(C28289B8j.LIZ(parent, R.layout.beo, parent, false));
        o.LJIIIZ(parent, "parent");
        this.LJZ = abstractC43973HNp;
        this.LJLIL = parent;
        this.LJLILLLLZI = num;
        this.LJLJI = (C72559Sdn) this.itemView.findViewById(R.id.n52);
        this.LJLJJI = (W5G) this.itemView.findViewById(R.id.n4v);
        View findViewById = this.itemView.findViewById(R.id.jsd);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.shadow_view)");
        this.LJLJJL = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.cje);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.duration_text)");
        this.LJLJJLL = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.cg4);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.download_state)");
        this.LJLJL = (TuxIconView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.c6g);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.delete_layout)");
        this.LJLJLJ = findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.glo);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.modify_layout)");
        this.LJLJLLL = findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.jl4);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.select_border_view)");
        this.LJLL = findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.c6f);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.delete_img_ugc)");
        this.LJLLI = findViewById7;
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.j83);
        this.LJLLILLLL = frameLayout;
        View findViewById8 = this.itemView.findViewById(R.id.c6e);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.delete_img)");
        ImageView imageView = (ImageView) findViewById8;
        this.LJLLJ = imageView;
        View findViewById9 = this.itemView.findViewById(R.id.i21);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.preview_border_view)");
        this.LJLLL = findViewById9;
        View findViewById10 = this.itemView.findViewById(R.id.dy4);
        o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.id.gradient_view)");
        this.LJLLLL = findViewById10;
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        this.LJLLLLLL = (int) C74275TDb.LIZIZ(context, 64.0f);
        float LJIIZILJ = C32151Nz.LJIIZILJ(Float.valueOf(abstractC43973HNp.LL()));
        Context context2 = parent.getContext();
        o.LJIIIIZZ(context2, "parent.context");
        Drawable LIZLLL = C78127UlP.LIZLLL(0, AnonymousClass636.LJIIIIZZ(R.attr.gv, context2), new float[]{0.0f, 0.0f, LJIIZILJ, LJIIZILJ, 0.0f, 0.0f, LJIIZILJ, LJIIZILJ});
        o.LJI(frameLayout);
        if (C173636rf.LIZIZ(frameLayout.getContext())) {
            Context context3 = parent.getContext();
            o.LJIIIIZZ(context3, "parent.context");
            LIZLLL = C78127UlP.LIZLLL(0, AnonymousClass636.LJIIIIZZ(R.attr.gv, context3), new float[]{LJIIZILJ, LJIIZILJ, 0.0f, 0.0f, LJIIZILJ, LJIIZILJ, 0.0f, 0.0f});
        }
        imageView.setBackground(LIZLLL);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LJFF = Integer.valueOf(R.attr.eb);
        c110614Vt.LIZLLL = AnonymousClass391.LIZJ(2);
        c110614Vt.LIZJ = Float.valueOf(LJIIZILJ);
        Context context4 = this.itemView.getContext();
        o.LJIIIIZZ(context4, "itemView.context");
        Drawable LIZ = c110614Vt.LIZ(context4);
        findViewById6.setBackground(LIZ);
        findViewById9.setBackground(LIZ);
        ViewGroup.LayoutParams layoutParams = findViewById4.getLayoutParams();
        Context context5 = findViewById4.getContext();
        o.LJIIIIZZ(context5, "deleteLayout.context");
        layoutParams.height = (int) C74275TDb.LIZIZ(context5, 36.0f);
        Context context6 = findViewById4.getContext();
        o.LJIIIIZZ(context6, "deleteLayout.context");
        layoutParams.width = (int) C74275TDb.LIZIZ(context6, 36.0f);
        findViewById4.setLayoutParams(layoutParams);
    }

    public final void L(MyMediaModel myMediaModel, C43976HNs holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (myMediaModel != null) {
            if (e1.LIZ(31744, "enable_music_stick_point", true, false) && !C1DG.LJIIIIZZ()) {
                N(this.LJLIL);
            }
            M(myMediaModel, holder);
            Q(myMediaModel, holder, i);
        }
        C16880lQ.LJIIJ(new IDlS18S0200000_7(this.LJZ, myMediaModel, 0), this.LJLJLJ);
        FrameLayout frameLayout = this.LJLLILLLL;
        if (frameLayout != null) {
            C16880lQ.LJIILJJIL(frameLayout, new ACListenerS42S0200000_7(this.LJZ, myMediaModel, 0));
        }
    }

    public final void P(int i, int i2, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.itemView.setLayoutParams(layoutParams);
        View view = this.LJLL;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
        layoutParams3.width = i;
        layoutParams3.height = i2;
        view.setLayoutParams(layoutParams3);
        W5G w5g = this.LJLJJI;
        if (w5g != null) {
            ViewGroup.LayoutParams layoutParams4 = w5g.getLayoutParams();
            o.LJII(layoutParams4, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
            layoutParams5.width = i;
            layoutParams5.height = i2;
            w5g.setLayoutParams(layoutParams5);
        }
        View view2 = this.LJLJLJ;
        ViewGroup.LayoutParams layoutParams6 = view2.getLayoutParams();
        o.LJII(layoutParams6, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) layoutParams6;
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        layoutParams7.width = (int) C74275TDb.LIZIZ(context, 20.0f);
        Context context2 = parent.getContext();
        o.LJIIIIZZ(context2, "parent.context");
        layoutParams7.height = (int) C74275TDb.LIZIZ(context2, 20.0f);
        view2.setLayoutParams(layoutParams7);
        C72559Sdn c72559Sdn = this.LJLJI;
        if (c72559Sdn != null) {
            c72559Sdn.setRadius((int) C32151Nz.LJIIZILJ(Float.valueOf(this.LJZ.LL())));
        }
    }

    public final void Q(MyMediaModel myMediaModel, C43976HNs holder, int i) {
        boolean z;
        boolean z2;
        int i2;
        String LIZIZ;
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        int i3;
        int i4;
        o.LJIIIZ(holder, "holder");
        if (myMediaModel == null) {
            return;
        }
        C45495HtL c45495HtL = myMediaModel.libraryState;
        int i5 = 8;
        if (c45495HtL != null) {
            if (c45495HtL.isFail() || (c45495HtL.getLastDownloadFailed() && c45495HtL.isLoading())) {
                this.LJLJL.setVisibility(0);
                TuxIconView tuxIconView = this.LJLJL;
                C2068389v c2068389v = new C2068389v();
                if (c45495HtL.isFail()) {
                    i4 = R.raw.icon_arrow_down_circle_fill;
                } else {
                    i4 = R.raw.icon_spinner_normal;
                }
                c2068389v.LIZ = i4;
                c2068389v.LJ = Integer.valueOf(R.attr.dj);
                tuxIconView.setTuxIcon(c2068389v);
            } else {
                holder.LJLJL.setVisibility(8);
            }
        } else {
            holder.LJLJL.setVisibility(8);
        }
        boolean z3 = true;
        if (myMediaModel.libraryState == null && myMediaModel.LJI()) {
            z = true;
        } else {
            z = false;
        }
        C45495HtL c45495HtL2 = myMediaModel.libraryState;
        if (c45495HtL2 != null && c45495HtL2.isSucceed()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((z || z2) && myMediaModel.duration >= 1000) {
            if (HOA.LIZ() && (interfaceC65784Pro = this.LJZ.LJLJLJ) != null && interfaceC65784Pro.invoke().booleanValue() && C79057V0z.LJJIJ(myMediaModel)) {
                i2 = myMediaModel.endTime - myMediaModel.startTime;
            } else {
                i2 = (int) myMediaModel.duration;
            }
            int LJJIIZ = O6R.LJJIIZ((i2 * 1.0f) / 1000);
            TuxTextView tuxTextView = this.LJLJJLL;
            this.LJZ.getClass();
            int i6 = LJJIIZ % 60;
            int i7 = LJJIIZ / 60;
            int i8 = i7 / 60;
            int i9 = i7 % 60;
            if (i8 == 0) {
                LIZIZ = C63144OqK.LIZIZ(new Object[]{Integer.valueOf(i9), Integer.valueOf(i6)}, 2, Locale.getDefault(), "%02d:%02d", "format(locale, format, *args)");
            } else {
                LIZIZ = C63144OqK.LIZIZ(new Object[]{Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i6)}, 3, Locale.getDefault(), "%02d:%02d:%02d", "format(locale, format, *args)");
            }
            tuxTextView.setText(LIZIZ);
            this.LJLJJLL.setVisibility(0);
        } else {
            this.LJLJJLL.setVisibility(8);
        }
        if (this.LJLJL.getVisibility() != 0 && this.LJLJJLL.getVisibility() != 0) {
            z3 = false;
        }
        View view = this.LJLLLL;
        if (z3) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view.setVisibility(i3);
        View view2 = this.LJLLL;
        if (this.LJZ.LJLJJI == i) {
            i5 = 0;
        }
        view2.setVisibility(i5);
    }
}
