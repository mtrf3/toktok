package X;

import Y.AObserverS80S0100000_12;
import Y.IDrS50S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.IDqS455S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TLo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74496TLo extends TL5<ProviderEffect> implements InterfaceC74487TLf<ProviderEffect> {
    public final LifecycleOwner LJJIJIL;
    public final TLK<ProviderEffect> LJJIJL;
    public final int LJJIJLIJ;
    public final boolean LJJIL;
    public final boolean LJJIZ;
    public final InterfaceC74506TLy LJJJ;
    public String LJJJI;
    public String LJJJIL;
    public final String LJJJJ;
    public int LJJJJI;
    public final C73893SzJ LJJJJIZL;
    public final C73893SzJ LJJJJJ;
    public final int LJJJJJL;
    public final List<MyMediaModel> LJJJJL;
    public final List<MyMediaModel> LJJJJLI;
    public final IDqS436S0100000_12 LJJJJLL;
    public final IDqS455S0100000_12 LJJJJZ;

    @Override // X.InterfaceC74486TLe
    public final void K4() {
    }

    @Override // X.TL5
    public final AbstractC45801HyH<C157166Eu> LJJII() {
        if (this.LJJIZ) {
            return new C45800HyG(this);
        }
        return new C45802HyI(this);
    }

    @Override // X.TL5, X.InterfaceC74488TLg
    public final void destroy() {
        MutableLiveData LLZZJLIL;
        super.destroy();
        TLK<ProviderEffect> tlk = this.LJJIJL;
        if (tlk != null && (LLZZJLIL = tlk.LLZZJLIL()) != null) {
            LLZZJLIL.removeObservers(this.LJJIJIL);
        }
    }

    @Override // X.InterfaceC74487TLf
    public final String LIZ() {
        return this.LJJJJ;
    }

    @Override // X.InterfaceC74487TLf
    public final String LIZLLL() {
        return this.LJJJIL;
    }

    @Override // X.TL5
    public final LifecycleOwner LJIIJ() {
        return this.LJJIJIL;
    }

    @Override // X.TL5
    public final int LJIIJJI() {
        return this.LJJIJLIJ;
    }

    @Override // X.InterfaceC74486TLe
    public final String LLZZJLIL() {
        return this.LJJJI;
    }

    @Override // X.InterfaceC74486TLe
    public final void J4(String str) {
        TLK<ProviderEffect> tlk = this.LJJIJL;
        if (tlk != null) {
            tlk.J4(str);
        }
    }

    @Override // X.InterfaceC74487TLf
    public final void LJ(String str) {
        this.LJJJIL = str;
    }

    @Override // X.TL5
    public final void LJIILJJIL(LifecycleOwner lifecycle) {
        o.LJIIIZ(lifecycle, "lifecycle");
        super.LJIILJJIL(lifecycle);
        TLK<ProviderEffect> tlk = this.LJJIJL;
        if (tlk != null) {
            tlk.LLZZJLIL().observe(lifecycle, new AObserverS80S0100000_12(this, 65));
        }
        LJIIL().LJIIJJI(new IDrS50S0100000_12(this, 14));
    }

    @Override // X.TL5
    public final TEW LJJIIJ(View content) {
        o.LJIIIZ(content, "content");
        TEW LJJIIJ = super.LJJIIJ(content);
        LJJIIJ.LIZ(TEN.LOADING, C72088SQy.LJLIL);
        LJJIIJ.LIZ(TEN.EMPTY, new AqS178S0100000_12(this, 415));
        LJJIIJ.LIZ(TEN.ERROR, new AqS178S0100000_12(this, 416));
        return LJJIIJ;
    }

    @Override // X.TL5
    public final RecyclerView LJJIIJZLJL(View content) {
        o.LJIIIZ(content, "content");
        RecyclerView recyclerView = (RecyclerView) content.findViewById(R.id.kie);
        if (this.LJJIL) {
            content.getContext();
            WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(this.LJJIJLIJ, 1, false);
            wrapGridLayoutManager.LLF(true);
            int i = this.LJJIJLIJ * this.LJJJJJL;
            wrapGridLayoutManager.LLIIII = i;
            recyclerView.setItemViewCacheSize(i);
            recyclerView.setLayoutManager(wrapGridLayoutManager);
        } else {
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(this.LJJIJLIJ, 1);
            recyclerView.setItemViewCacheSize(this.LJJIJLIJ);
            recyclerView.setLayoutManager(staggeredGridLayoutManager);
        }
        o.LJIIIIZZ(recyclerView, "recyclerView");
        C26338AVi.LJI(recyclerView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(1))), 0, 0, 0, false, 16);
        return recyclerView;
    }

    public final void LJJIJ(int i) {
        LinearLayoutManager linearLayoutManager;
        int LLILL;
        int LLILLJJLI;
        C74499TLr c74499TLr;
        C72791ShX c72791ShX;
        boolean z;
        C0A2 layoutManager = LJIIL().getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || (LLILL = linearLayoutManager.LLILL()) > (LLILLJJLI = linearLayoutManager.LLILLJJLI())) {
            return;
        }
        while (true) {
            RecyclerView.ViewHolder LJJIZ = LJIIL().LJJIZ(LLILL);
            if ((LJJIZ instanceof C74499TLr) && (c74499TLr = (C74499TLr) LJJIZ) != null) {
                W5G w5g = c74499TLr.LJLLL;
                if ((w5g instanceof C72791ShX) && (c72791ShX = (C72791ShX) w5g) != null) {
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c72791ShX.LIZ(z);
                }
            }
            if (LLILL != LLILLJJLI) {
                LLILL++;
            } else {
                return;
            }
        }
    }

    @Override // X.TL5
    public final RecyclerView.ViewHolder LJIIIZ(ViewGroup parent, InterfaceC88473Ynt clickListener) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(clickListener, "clickListener");
        C74461TKf c74461TKf = new C74461TKf(this.LJJIFFI);
        c74461TKf.LIZLLL = (int) C74275TDb.LIZIZ(this.LJJIFFI, 80.0f);
        c74461TKf.LJ = (int) C74275TDb.LIZIZ(this.LJJIFFI, 80.0f);
        c74461TKf.LJIIIIZZ = false;
        c74461TKf.LJJIJIIJI = R.drawable.tf;
        c74461TKf.LJJIJIIJIL = R.drawable.th;
        c74461TKf.LJJIFFI = true;
        TDE LIZIZ = c74461TKf.LIZIZ();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        LIZIZ.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(this.LJJIFFI);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        frameLayout.addView(LIZIZ);
        return new C74499TLr(this.LJJIJLIJ, frameLayout, LIZIZ, this.LJJJJLL, this.LJJIL, this.LJJIZ, this.LJJJJZ, this.LJJJ);
    }

    @Override // X.TL5
    /* renamed from: LJJIIZI, reason: merged with bridge method [inline-methods] */
    public final void LJII(RecyclerView.ViewHolder holder, int i, ProviderEffect sticker, TEA state, Integer num) {
        C74499TLr c74499TLr;
        float f;
        String height;
        Float LJJIJLIJ;
        String width;
        Float LJJIJLIJ2;
        int i2;
        Integer library_material_type;
        Float LJJIJLIJ3;
        Float LJJIJLIJ4;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(sticker, "sticker");
        o.LJIIIZ(state, "state");
        boolean z = true;
        MyMediaModel myMediaModel = null;
        if (this.LJJIZ && (!((ArrayList) this.LJJJJL).isEmpty())) {
            myMediaModel = (MyMediaModel) ListProtector.get(this.LJJJJL, i);
        }
        if ((holder instanceof C74499TLr) && (c74499TLr = (C74499TLr) holder) != null) {
            int i3 = this.LJJJJI;
            c74499TLr.LJLLLL = myMediaModel;
            float f2 = 1.0f;
            if (sticker.getLibrary_material_type() != null && ((library_material_type = sticker.getLibrary_material_type()) == null || library_material_type.intValue() != 0)) {
                String width2 = sticker.getWidth();
                if (width2 != null && (LJJIJLIJ4 = C38350F3i.LJJIJLIJ(width2)) != null) {
                    f = LJJIJLIJ4.floatValue();
                } else {
                    f = 1.0f;
                }
                String height2 = sticker.getHeight();
                if (height2 != null && (LJJIJLIJ3 = C38350F3i.LJJIJLIJ(height2)) != null) {
                    f2 = LJJIJLIJ3.floatValue();
                }
            } else {
                ProviderEffect.StickerBean sticker_info = sticker.getSticker_info();
                if (sticker_info != null && (width = sticker_info.getWidth()) != null && (LJJIJLIJ2 = C38350F3i.LJJIJLIJ(width)) != null) {
                    f = LJJIJLIJ2.floatValue();
                } else {
                    f = 1.0f;
                }
                ProviderEffect.StickerBean sticker_info2 = sticker.getSticker_info();
                if (sticker_info2 != null && (height = sticker_info2.getHeight()) != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(height)) != null) {
                    f2 = LJJIJLIJ.floatValue();
                }
            }
            int i4 = (int) ((c74499TLr.LJZ / f) * f2);
            FrameLayout frameLayout = c74499TLr.LJLLJ;
            C26338AVi.LJI(frameLayout, 0, Integer.valueOf(c74499TLr.LJLZ), 0, Integer.valueOf(c74499TLr.LJLZ), false, 16);
            frameLayout.getLayoutParams().width = c74499TLr.LJZ;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (c74499TLr.LJLJJLL) {
                i2 = c74499TLr.LJZ;
            } else {
                i2 = i4;
            }
            layoutParams.height = i2;
            frameLayout.setBackgroundColor(C04330Ez.LIZIZ(c74499TLr.itemView.getContext(), R.color.ao));
            c74499TLr.L(sticker, i, state, num);
            W5G w5g = c74499TLr.LJLLL;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(c74499TLr.LJZ, i4);
            layoutParams2.gravity = 17;
            w5g.setLayoutParams(layoutParams2);
            if (c74499TLr.LJLJJLL) {
                w5g.setBackgroundColor(C04330Ez.LIZIZ(c74499TLr.itemView.getContext(), R.color.cz));
                return;
            }
            w5g.setBackgroundColor(C04330Ez.LIZIZ(c74499TLr.itemView.getContext(), R.color.ao));
            C72791ShX c72791ShX = (C72791ShX) w5g;
            if (i3 != 0) {
                z = false;
            }
            c72791ShX.LIZ(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74496TLo(Context context, LifecycleOwner lifecycle, TLK<com.ss.android.ugc.effectmanager.effect.model.ProviderEffect> tlk, TLD<com.ss.android.ugc.effectmanager.effect.model.ProviderEffect> tld, ViewGroup viewGroup, int i, boolean z, boolean z2, InterfaceC74506TLy interfaceC74506TLy, InterfaceC88472Yns<? super TL7, C76800UCe> interfaceC88472Yns) {
        super(context, lifecycle, (TL9) tlk, (TLD) tld, viewGroup, i, false, false, true, (InterfaceC88472Yns) interfaceC88472Yns, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT);
        o.LJIIIZ(lifecycle, "lifecycle");
        this.LJJIJIL = lifecycle;
        this.LJJIJL = tlk;
        this.LJJIJLIJ = i;
        this.LJJIL = z;
        this.LJJIZ = z2;
        this.LJJJ = interfaceC74506TLy;
        this.LJJJIL = "";
        FFL.LJIIIZ().getClass();
        String LJIILJJIL = FFL.LJIILJJIL(31744, "studio_library_home_content", "", true);
        o.LJIIIIZZ(LJIILJJIL, "getInstance().getStringV…angeTrending::class.java)");
        this.LJJJJ = LJIILJJIL;
        this.LJJJJIZL = new C73893SzJ();
        this.LJJJJJ = new C73893SzJ();
        C74500TLs.LIZ.getClass();
        this.LJJJJJL = C74500TLs.LIZ().feedPerformanceMultiplier;
        this.LJJJJL = new ArrayList();
        this.LJJJJLI = new ArrayList();
        this.LJJJJLL = new IDqS436S0100000_12(this, 22);
        this.LJJJJZ = new IDqS455S0100000_12(this, 4);
    }
}
