package X;

import android.content.Context;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4bs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112884bs {
    public final View LIZ;
    public final InterfaceC112854bp LIZIZ;
    public final C113054c9 LIZJ;
    public final SmartImageView LIZLLL;
    public final View LJ;
    public final TuxIconView LJFF;
    public final TuxTextView LJI;
    public final TuxIconView LJII;
    public final View LJIIIIZZ;
    public final C5GC LJIIIZ;
    public final View LJIIJ;
    public final C116414hZ LJIIJJI;
    public final View LJIIL;
    public final TuxTextView LJIILIIL;
    public final View LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public final C62822Ol8 LJIILLIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C112884bs)) {
            return false;
        }
        C112884bs c112884bs = (C112884bs) obj;
        return o.LJ(this.LIZ, c112884bs.LIZ) && o.LJ(this.LIZIZ, c112884bs.LIZIZ) && o.LJ(this.LIZJ, c112884bs.LIZJ) && o.LJ(this.LIZLLL, c112884bs.LIZLLL) && o.LJ(this.LJ, c112884bs.LJ) && o.LJ(this.LJFF, c112884bs.LJFF) && o.LJ(this.LJI, c112884bs.LJI) && o.LJ(this.LJII, c112884bs.LJII) && o.LJ(this.LJIIIIZZ, c112884bs.LJIIIIZZ) && o.LJ(this.LJIIIZ, c112884bs.LJIIIZ) && o.LJ(this.LJIIJ, c112884bs.LJIIJ) && o.LJ(this.LJIIJJI, c112884bs.LJIIJJI) && o.LJ(this.LJIIL, c112884bs.LJIIL) && o.LJ(this.LJIILIIL, c112884bs.LJIILIIL) && o.LJ(this.LJIILJJIL, c112884bs.LJIILJJIL);
    }

    public final int hashCode() {
        int hashCode = (this.LJII.hashCode() + ((this.LJI.hashCode() + ((this.LJFF.hashCode() + ((this.LJ.hashCode() + ((this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        View view = this.LJIIIIZZ;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        C5GC c5gc = this.LJIIIZ;
        return this.LJIILJJIL.hashCode() + ((this.LJIILIIL.hashCode() + ((this.LJIIL.hashCode() + ((this.LJIIJJI.hashCode() + ((this.LJIIJ.hashCode() + ((hashCode2 + (c5gc != null ? c5gc.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MediaThumbnailViewRef(itemView=" + this.LIZ + ", type=" + this.LIZIZ + ", contentV=" + this.LIZJ + ", contentImageView=" + this.LIZLLL + ", nudeContent=" + this.LJ + ", nudeContentIcon=" + this.LJFF + ", nudeContentCopy=" + this.LJI + ", nudeThumbnailIcon=" + this.LJII + ", playButton=" + this.LJIIIIZZ + ", progressBar=" + this.LJIIIZ + ", tiktokLogoPlaceholder=" + this.LJIIJ + ", loadingSpinner=" + this.LJIIJJI + ", errorView=" + this.LJIIL + ", safetyCopy=" + this.LJIILIIL + ", safetyMask=" + this.LJIILJJIL + ')';
    }

    public final Context LIZ() {
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        return context;
    }

    public final C62846OlW LIZIZ() {
        Object value = this.LJIILLIIL.getValue();
        o.LJIIIIZZ(value, "<get-errorIcon>(...)");
        return (C62846OlW) value;
    }

    public C112884bs(View itemView, InterfaceC112854bp type) {
        View view;
        View findViewById = itemView.findViewById(R.id.l75);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.thumbnail_content)");
        C113054c9 c113054c9 = (C113054c9) findViewById;
        View findViewById2 = itemView.findViewById(R.id.bt9);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.content_base)");
        SmartImageView smartImageView = (SmartImageView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.h8j);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.nude_filter_content)");
        View findViewById4 = itemView.findViewById(R.id.h8l);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.…nude_filter_content_icon)");
        TuxIconView tuxIconView = (TuxIconView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.h8k);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.…nude_filter_content_copy)");
        TuxTextView tuxTextView = (TuxTextView) findViewById5;
        View findViewById6 = itemView.findViewById(R.id.h8m);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.…de_filter_thumbnail_icon)");
        TuxIconView tuxIconView2 = (TuxIconView) findViewById6;
        if (o.LJ(type, C4XB.LIZ)) {
            view = itemView.findViewById(R.id.f8q);
        } else {
            view = null;
        }
        C5GC c5gc = (C5GC) itemView.findViewById(R.id.iam);
        View findViewById7 = itemView.findViewById(R.id.l7j);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.….tiktok_logo_placeholder)");
        View findViewById8 = itemView.findViewById(R.id.g8x);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.loading_spinner)");
        View findViewById9 = itemView.findViewById(R.id.cy6);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.error_content)");
        View findViewById10 = itemView.findViewById(R.id.mid);
        o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.id.tv_safety_copy)");
        View findViewById11 = itemView.findViewById(R.id.ja6);
        o.LJIIIIZZ(findViewById11, "itemView.findViewById(R.id.safety_mask)");
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        this.LIZ = itemView;
        this.LIZIZ = type;
        this.LIZJ = c113054c9;
        this.LIZLLL = smartImageView;
        this.LJ = findViewById3;
        this.LJFF = tuxIconView;
        this.LJI = tuxTextView;
        this.LJII = tuxIconView2;
        this.LJIIIIZZ = view;
        this.LJIIIZ = c5gc;
        this.LJIIJ = findViewById7;
        this.LJIIJJI = (C116414hZ) findViewById8;
        this.LJIIL = findViewById9;
        this.LJIILIIL = (TuxTextView) findViewById10;
        this.LJIILJJIL = findViewById11;
        this.LJIILL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1009));
        this.LJIILLIIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1008));
    }
}
