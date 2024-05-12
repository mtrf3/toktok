package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Lzb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56075Lzb extends FrameLayout {
    public View LJLIL;
    public InterfaceC56083Lzj LJLILLLLZI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJI;
    public C73305Spp LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public TemplateData LJLJL;
    public boolean LJLJLJ;
    public final M1V LJLJLLL;

    public final InterfaceC56083Lzj getShopContentAction() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56075Lzb(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLJLJ = true;
        M1W predicate = M1W.LJLIL;
        AqS191S0100000_9 aqS191S0100000_9 = new AqS191S0100000_9(this, 1);
        C56119M0t c56119M0t = C56119M0t.LJLIL;
        C56114M0o c56114M0o = C56114M0o.LJLIL;
        o.LJIIIZ(predicate, "predicate");
        M1V m1v = new M1V(predicate, aqS191S0100000_9, c56119M0t, c56114M0o);
        this.LJLJLLL = m1v;
        C61269O2v.LIZ.add(m1v);
    }

    public final void setError(String errMsg) {
        o.LJIIIZ(errMsg, "errMsg");
        C36746EbW.LIZ(3, "lynxDataTemplate setError");
        this.LJLJL = TemplateData.LJFF(errMsg);
        if (this.LJLJJLL) {
            Object obj = null;
            this.LJLJL = null;
            C36746EbW.LIZ(3, "updateData");
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                obj = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView();
            }
            if (obj instanceof VNS) {
                ((VNS) obj).updateData(TemplateData.LJFF(errMsg));
            }
            setVisibility(0);
            View view = this.LJLIL;
            if (view != null) {
                view.setVisibility(8);
            }
            C73305Spp c73305Spp = this.LJLJJI;
            if (c73305Spp == null) {
                return;
            }
            c73305Spp.setVisibility(8);
        }
    }

    public final void setErrorViewVis$ecommerce_fashionmall_release(boolean z) {
        int i;
        C73305Spp c73305Spp = this.LJLJJI;
        if (c73305Spp == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        c73305Spp.setVisibility(i);
    }

    public final void setLynxLoadStatus(boolean z) {
        this.LJLJJLL = z;
    }

    public final void setShopContentAction(InterfaceC56083Lzj interfaceC56083Lzj) {
        this.LJLILLLLZI = interfaceC56083Lzj;
    }

    public final void setSkeletonViewVis$ecommerce_fashionmall_release(boolean z) {
        int i;
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void setSparkView(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        this.LJLJJLL = false;
        this.LJLJI = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("registJSB mSparkView=");
        LIZ.append(this.LJLJI);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
            C38236EzY c38236EzY = new C38236EzY();
            c38236EzY.LIZ = "ec_mall_set_skin_id";
            c38236EzY.LIZLLL = new C56078Lze(this);
            C79081V1x.LJJIJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2, c38236EzY);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 != null) {
            C38236EzY c38236EzY2 = new C38236EzY();
            c38236EzY2.LIZ = "ec_mall_get_previous_page";
            c38236EzY2.LIZLLL = new C56080Lzg(this);
            C79081V1x.LJJIJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3, c38236EzY2);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 != null) {
            C38236EzY c38236EzY3 = new C38236EzY();
            c38236EzY3.LIZ = "ec_mall_set_recommend_tab";
            c38236EzY3.LIZLLL = new C56076Lzc(this);
            C79081V1x.LJJIJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4, c38236EzY3);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS5 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS5 != null) {
            C38236EzY c38236EzY4 = new C38236EzY();
            c38236EzY4.LIZ = "ec_shopping_center_update_back_to_top_visibility";
            c38236EzY4.LIZLLL = new C56077Lzd(this);
            C79081V1x.LJJIJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS5, c38236EzY4);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS6 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS6 != null) {
            C38236EzY c38236EzY5 = new C38236EzY();
            c38236EzY5.LIZ = "ec_mall_recommend_show_data";
            c38236EzY5.LIZLLL = new C56079Lzf(this);
            C79081V1x.LJJIJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS6, c38236EzY5);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS7 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS7 != null) {
            Iterator it = C47261Igj.LJJIJIIJI(YDN.class, YDO.class).iterator();
            while (it.hasNext()) {
                C79081V1x.LJJIJIIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS7, (Class) it.next());
            }
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS8 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS8 != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS8.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        try {
            addView(this.LJLJI);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS9 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS9 != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS9.LIZIZ();
        }
    }

    public final void setSparkViewVis$ecommerce_fashionmall_release(boolean z) {
        int i;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.setVisibility(i);
    }

    public final void LIZ(C56020Lyi c56020Lyi, boolean z) {
        boolean z2;
        boolean z3;
        if (c56020Lyi != null) {
            ILR ilr = c56020Lyi.LJLLLLLL;
            ILR ilr2 = ILR.COMPLETED;
            if (ilr != ilr2) {
                String str = "1";
                if (this.LJLJLJ) {
                    C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
                    String stage = EnumC56081Lzh.STAGE_UPDATE_DATA.getStage();
                    String str2 = c56020Lyi.LJZ;
                    long currentTimeMillis = System.currentTimeMillis() - C56090Lzq.LIZ;
                    if (c56020Lyi.LJLLLLLL == ILR.FAILED) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    OSZ[] oszArr = new OSZ[2];
                    oszArr[0] = new OSZ("is_data_cache", "1");
                    if (!z) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    oszArr[1] = new OSZ("lynx_load_success_earlier", str);
                    C56045Lz7.LJIILIIL(c56045Lz7, stage, str2, currentTimeMillis, z3, C113554cx.LJJL(oszArr), 8);
                    return;
                }
                C56045Lz7 c56045Lz72 = C56045Lz7.LIZ;
                String stage2 = EnumC56081Lzh.STAGE_UPDATE_DATA.getStage();
                String str3 = c56020Lyi.LJZ;
                long currentTimeMillis2 = System.currentTimeMillis() - C56090Lzq.LIZ;
                if (c56020Lyi.LJLLLLLL == ILR.FAILED) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                OSZ[] oszArr2 = new OSZ[2];
                oszArr2[0] = new OSZ("is_data_cache", CardStruct.IStatusCode.DEFAULT);
                if (!z) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                oszArr2[1] = new OSZ("lynx_load_success_earlier", str);
                C56045Lz7.LJIILIIL(c56045Lz72, stage2, str3, currentTimeMillis2, z2, C113554cx.LJJL(oszArr2), 8);
                o.LJIIIZ(ilr2, "<set-?>");
                c56020Lyi.LJLLLLLL = ilr2;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("MallLoadDataStatus ");
                LIZ.append(c56020Lyi.LJLLLLLL.name());
                C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
            }
        }
    }
}
