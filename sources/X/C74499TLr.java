package X;

import Y.ARunnableS31S0200000_12;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.views.IDlS19S0200000_12;
import com.ss.android.ugc.aweme.views.IDlS64S0100000_12;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.IDqS455S0100000_12;
import kotlin.jvm.internal.o;
import o53.IDdS477S0100000_12;

/* renamed from: X.TLr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74499TLr extends TL1<ProviderEffect> {
    public final boolean LJLJJLL;
    public final boolean LJLJL;
    public final InterfaceC88474Ynu<ProviderEffect, Integer, TEA, MyMediaModel, C76800UCe> LJLJLJ;
    public final InterfaceC74506TLy LJLJLLL;
    public final FrameLayout LJLL;
    public final TextView LJLLI;
    public final View LJLLILLLL;
    public final FrameLayout LJLLJ;
    public final W5G LJLLL;
    public MyMediaModel LJLLLL;
    public boolean LJLLLLLL;
    public final int LJLZ;
    public final int LJZ;
    public final IDdS477S0100000_12 LJZI;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r4.LJLJJLL == false) goto L5;
     */
    @Override // X.TL1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJZZIII(com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r5) {
        /*
            r4 = this;
            com.ss.android.ugc.effectmanager.effect.model.ProviderEffect r5 = (com.ss.android.ugc.effectmanager.effect.model.ProviderEffect) r5
            java.lang.String r0 = "stickerData"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            X.TDE r1 = r4.LJLJJI
            java.lang.Integer r0 = r5.getLibrary_material_type()
            r3 = 0
            if (r0 != 0) goto L2e
        L10:
            r2 = 0
        L11:
            r1.LJIILL()
            r0 = 2131369685(0x7f0a1ed5, float:1.8359355E38)
            android.view.View r1 = r1.findViewById(r0)
            java.lang.String r0 = "findViewById<ImageView>(R.id.iv_sticker_state)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.C87277YNd.LJJIJIIJIL(r1, r2)
            boolean r0 = r4.LJLJL
            if (r0 == 0) goto L2a
            r4.P(r3)
        L2a:
            r4.M(r5)
            return
        L2e:
            int r0 = r0.intValue()
            r2 = 1
            if (r0 != r2) goto L10
            boolean r0 = r4.LJLJJLL
            if (r0 != 0) goto L10
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74499TLr.LJJZZIII(java.lang.Object):void");
    }

    public final void M(ProviderEffect providerEffect) {
        boolean z;
        String url;
        Integer library_material_type;
        TDE tde = this.LJLJJI;
        Integer library_material_type2 = providerEffect.getLibrary_material_type();
        if (library_material_type2 == null || library_material_type2.intValue() != 2 || this.LJLJJLL) {
            z = false;
        } else {
            z = true;
        }
        tde.LJIILL();
        View findViewById = tde.findViewById(R.id.fan);
        o.LJIIIIZZ(findViewById, "findViewById<ImageView>(R.id.iv_sticker_state)");
        C87277YNd.LJJIJIIJIL(findViewById, z);
        this.LJLJJI.LJIIZILJ(this.LJLJJLL);
        this.LJLJJI.LJIJ(null);
        if (providerEffect.getLibrary_material_type() != null && ((library_material_type = providerEffect.getLibrary_material_type()) == null || library_material_type.intValue() != 0)) {
            url = providerEffect.getPreview_webp();
        } else {
            ProviderEffect.StickerBean sticker_info = providerEffect.getSticker_info();
            if (sticker_info == null) {
                return;
            } else {
                url = sticker_info.getUrl();
            }
        }
        if (url != null && url.length() > 0) {
            this.LJLLLLLL = true;
            W5G w5g = this.LJLLL;
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(url);
            urlModel.setUrlList(C47261Igj.LJJIJ(url));
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            C74500TLs.LIZ.getClass();
            C78764Uvg.LJII(w5g, urlModel, config, C74500TLs.LIZ().animateFeed, this.LJZI);
        }
    }

    public final boolean N(com.ss.android.ugc.effectmanager.effect.model.ProviderEffect providerEffect) {
        if (getAdapterPosition() == -1) {
            return false;
        }
        if (this.LJLLLLLL) {
            InterfaceC74506TLy interfaceC74506TLy = this.LJLJLLL;
            if (interfaceC74506TLy != null) {
                interfaceC74506TLy.LIZJ();
            }
            M(providerEffect);
            return false;
        }
        return true;
    }

    public final void P(boolean z) {
        int i;
        float f;
        float f2;
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = 4;
        MyMediaModel myMediaModel = this.LJLLLL;
        if (myMediaModel != null) {
            i = myMediaModel.selectIndex;
        } else {
            i = -1;
        }
        boolean z2 = true;
        float f3 = 1.0f;
        if (i > 0) {
            TextView textView = this.LJLLI;
            if (textView != null) {
                textView.setText(String.valueOf(i));
                TextView textView2 = this.LJLLI;
                if (textView2 != null) {
                    textView2.setBackgroundResource(R.drawable.tv);
                    c76732zl.element = 0;
                    f2 = 1.1f;
                    f = 1.0f;
                } else {
                    o.LJIJI("selectIndexView");
                    throw null;
                }
            } else {
                o.LJIJI("selectIndexView");
                throw null;
            }
        } else {
            TextView textView3 = this.LJLLI;
            if (textView3 != null) {
                textView3.setText("");
                TextView textView4 = this.LJLLI;
                if (textView4 != null) {
                    textView4.setBackgroundResource(R.drawable.tu);
                    InterfaceC74506TLy interfaceC74506TLy = this.LJLJLLL;
                    if (interfaceC74506TLy != null && interfaceC74506TLy.LIZIZ()) {
                        f3 = 0.5f;
                    } else {
                        f3 = 1.0f;
                    }
                    c76732zl.element = 4;
                    f = 0.0f;
                    f2 = 1.0f;
                } else {
                    o.LJIJI("selectIndexView");
                    throw null;
                }
            } else {
                o.LJIJI("selectIndexView");
                throw null;
            }
        }
        if (this.LJLLL.getAlpha() != f3) {
            this.LJLLL.setAlpha(f3);
        }
        if (this.LJLLL.getScaleX() != f2) {
            z2 = false;
        }
        if (!z2 && z) {
            this.LJLLL.animate().scaleY(f2).scaleX(f2).setDuration(300L).start();
            int i2 = c76732zl.element;
            if (i2 == 4) {
                View view = this.LJLLILLLL;
                if (view != null) {
                    C09K.LIZ(view, f, 300L).withEndAction(new ARunnableS31S0200000_12(c76732zl, this, 24)).start();
                    return;
                } else {
                    o.LJIJI("shadowView");
                    throw null;
                }
            }
            View view2 = this.LJLLILLLL;
            if (view2 != null) {
                view2.setVisibility(i2);
                View view3 = this.LJLLILLLL;
                if (view3 != null) {
                    view3.animate().alpha(f).setDuration(300L).start();
                    return;
                } else {
                    o.LJIJI("shadowView");
                    throw null;
                }
            }
            o.LJIJI("shadowView");
            throw null;
        }
        this.LJLLL.setAlpha(f3);
        View view4 = this.LJLLILLLL;
        if (view4 != null) {
            view4.setAlpha(f);
            View view5 = this.LJLLILLLL;
            if (view5 != null) {
                view5.setVisibility(c76732zl.element);
                return;
            } else {
                o.LJIJI("shadowView");
                throw null;
            }
        }
        o.LJIJI("shadowView");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74499TLr(int i, View view, TDE tde, IDqS436S0100000_12 clickListener, boolean z, boolean z2, IDqS455S0100000_12 iDqS455S0100000_12, InterfaceC74506TLy interfaceC74506TLy) {
        super(view, tde, clickListener);
        o.LJIIIZ(clickListener, "clickListener");
        this.LJLJJLL = z;
        this.LJLJL = z2;
        this.LJLJLJ = iDqS455S0100000_12;
        this.LJLJLLL = interfaceC74506TLy;
        View findViewById = tde.findViewById(R.id.crm);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.effect_container)");
        this.LJLLJ = (FrameLayout) findViewById;
        this.LJLLLLLL = true;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        int LIZIZ = (int) C74275TDb.LIZIZ(context, 1.0f);
        this.LJLZ = LIZIZ;
        this.LJZ = ((C74275TDb.LJ(view.getContext()) - 0) / i) - (LIZIZ * 2);
        if (z) {
            View findViewById2 = tde.findViewById(R.id.csq);
            ((ImageView) findViewById2).setVisibility(0);
            o.LJIIIIZZ(findViewById2, "view.findViewById<Simple…VISIBLE\n                }");
            this.LJLLL = (W5G) findViewById2;
            ((ImageView) tde.findViewById(R.id.csp)).setVisibility(8);
        } else {
            View findViewById3 = tde.findViewById(R.id.csp);
            ((ImageView) findViewById3).setVisibility(0);
            o.LJIIIIZZ(findViewById3, "view.findViewById<Circle…iew.VISIBLE\n            }");
            this.LJLLL = (W5G) findViewById3;
            ((ImageView) tde.findViewById(R.id.csq)).setVisibility(8);
        }
        if (z2) {
            View findViewById4 = tde.findViewById(R.id.ded);
            o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.fl_image_select_indicator)");
            FrameLayout frameLayout = (FrameLayout) findViewById4;
            this.LJLL = frameLayout;
            C87277YNd.LJJIJIIJIL(frameLayout, true);
            View findViewById5 = tde.findViewById(R.id.ehy);
            o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.image_select_indicator)");
            this.LJLLI = (TextView) findViewById5;
            View findViewById6 = tde.findViewById(R.id.jsd);
            o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.shadow_view)");
            this.LJLLILLLL = findViewById6;
            C16880lQ.LJIILJJIL(frameLayout, new IDlS64S0100000_12((Object) this, 2));
            C16880lQ.LJIIJ(new IDlS19S0200000_12(this, clickListener, 1), view);
        }
        this.LJZI = new IDdS477S0100000_12(this, 3);
    }
}
