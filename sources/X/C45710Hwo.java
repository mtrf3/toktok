package X;

import Y.ACListenerS27S0100000_7;
import Y.ACListenerS42S0200000_7;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.LibraryModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS14S0200100_7;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hwo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45710Hwo implements InterfaceC46114I7y {
    public final /* synthetic */ C45709Hwn LIZ;

    public C45710Hwo(C45709Hwn c45709Hwn) {
        this.LIZ = c45709Hwn;
    }

    @Override // X.InterfaceC46114I7y
    public final void LIZ(String categoryName) {
        CreativeModel creativeModel;
        LibraryModel libraryModel;
        CreativeModel creativeModel2;
        LibraryModel libraryModel2;
        o.LJIIIZ(categoryName, "categoryName");
        C45709Hwn c45709Hwn = this.LIZ;
        ShortVideoContext shortVideoContext = c45709Hwn.LJLJI;
        if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null && (libraryModel2 = creativeModel2.libraryModel) != null) {
            libraryModel2.lastLibraryCategory = categoryName;
        }
        VideoPublishEditModel videoPublishEditModel = c45709Hwn.LJLJJI;
        if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (libraryModel = creativeModel.libraryModel) == null) {
            return;
        }
        libraryModel.lastLibraryCategory = categoryName;
    }

    @Override // X.InterfaceC46114I7y
    public final void LIZIZ(List<OSZ<ProviderEffect, Integer>> dataList) {
        o.LJIIIZ(dataList, "dataList");
        if (C45716Hwu.LIZ()) {
            C45709Hwn c45709Hwn = this.LIZ;
            if (!c45709Hwn.LJZ) {
                C43713HDp c43713HDp = c45709Hwn.LJLLL;
                String str = null;
                if (c43713HDp != null) {
                    TM0 tm0 = c45709Hwn.LJLLJ;
                    if (tm0 != null) {
                        str = tm0.LLJILJIL();
                    }
                    C43714HDq LJI = C43713HDp.LJI(c43713HDp);
                    C145995oB c145995oB = new C145995oB();
                    c145995oB.LJI("impression_id", str);
                    c145995oB.LJI("enter_from", LJI.getEnterFrom());
                    c145995oB.LJI("creation_id", LJI.getCreationId());
                    c145995oB.LJI("shoot_way", LJI.getShootWay());
                    FMX.LJIIL("show_library_user_gallery_button", c145995oB.LIZ);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onGalleryButtonShow -> impressionId = ");
                    LIZ.append(str);
                    LIZ.append(" enterFrom = ");
                    LIZ.append(LJI.getEnterFrom());
                    LIZ.append(" creationId = ");
                    LIZ.append(LJI.getCreationId());
                    LIZ.append(" shootWay = ");
                    LIZ.append(LJI.getShootWay());
                    H7B.LIZIZ("MobLibrary", X1D.LIZIZ(LIZ));
                    this.LIZ.LJZ = true;
                    return;
                }
                o.LJIJI("mobHelper");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0061 A[ORIG_RETURN, RETURN] */
    @Override // X.InterfaceC46114I7y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45710Hwo.LIZLLL(int):void");
    }

    @Override // X.InterfaceC46114I7y
    public final void LJ(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        String str;
        W5G w5g;
        FrameLayout frameLayout;
        ImageView imageView;
        C45709Hwn c45709Hwn = this.LIZ;
        LibraryMaterialInfoSv libraryMaterialInfoSv = c45709Hwn.LJLJJL;
        if (libraryMaterialInfoSv != null && c45709Hwn.LJLILLLLZI == EnumC45707Hwl.GRID_VIEW_WITH_CARD) {
            View inflate = ((ViewStub) viewGroup.findViewById(R.id.fq_)).inflate();
            c45709Hwn.LJLJLLL = inflate;
            c45709Hwn.LJLL = EnumC45711Hwp.EXPANDED;
            String str2 = null;
            if (inflate != null) {
                viewGroup2 = (ViewGroup) inflate.findViewById(R.id.fq8);
            } else {
                viewGroup2 = null;
            }
            Context context = c45709Hwn.LJLLILLLL;
            if (context != null) {
                C74461TKf c74461TKf = new C74461TKf(context);
                View view = c45709Hwn.LJLJLLL;
                if (view != null && (imageView = (ImageView) view.findViewById(R.id.f0k)) != null) {
                    C16880lQ.LJIILLIIL(imageView, new ACListenerS27S0100000_7(c45709Hwn, 171));
                }
                View view2 = c45709Hwn.LJLJLLL;
                if (view2 != null && (frameLayout = (FrameLayout) view2.findViewById(R.id.ap4)) != null) {
                    C16880lQ.LJIILJJIL(frameLayout, new ACListenerS42S0200000_7(c45709Hwn, libraryMaterialInfoSv, 44));
                }
                c74461TKf.LJIIIIZZ = false;
                c74461TKf.LJJIFFI = true;
                TDE LIZIZ = c74461TKf.LIZIZ();
                LIZIZ.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                LIZIZ.LJIL();
                if (viewGroup2 != null) {
                    viewGroup2.addView(LIZIZ);
                }
                C72790ShW imageView2 = LIZIZ.getImageView();
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                Context context2 = c45709Hwn.LJLLILLLL;
                if (context2 != null) {
                    layoutParams.width = (int) C74275TDb.LIZIZ(context2, 160.0f);
                    ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                    Context context3 = c45709Hwn.LJLLILLLL;
                    if (context3 != null) {
                        layoutParams2.height = (int) C74275TDb.LIZIZ(context3, 160.0f);
                        UrlModel cover = libraryMaterialInfoSv.getCover();
                        if (cover != null) {
                            str = cover.getUri();
                        } else {
                            str = null;
                        }
                        C170676mt.LIZIZ(imageView2, String.valueOf(str), Bitmap.Config.ARGB_8888);
                        View view3 = c45709Hwn.LJLJLLL;
                        if (view3 != null && (w5g = (W5G) view3.findViewById(R.id.f65)) != null) {
                            w5g.setVisibility(8);
                            UrlModel cover2 = libraryMaterialInfoSv.getCover();
                            if (cover2 != null) {
                                str2 = cover2.getUri();
                            }
                            C170676mt.LIZIZ(w5g, String.valueOf(str2), Bitmap.Config.ARGB_8888);
                            C16880lQ.LJIIJ(new C45715Hwt(new AqS154S0200000_7(c45709Hwn, libraryMaterialInfoSv, 128)), w5g);
                            return;
                        }
                        return;
                    }
                    o.LJIJI("mContext");
                    throw null;
                }
                o.LJIJI("mContext");
                throw null;
            }
            o.LJIJI("mContext");
            throw null;
        }
    }

    @Override // X.InterfaceC46114I7y
    public final void LIZJ(ProviderEffect data, TEA state, ArrayList arrayList) {
        CreativeFlowData creativeFlowData;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(state, "state");
        long currentTimeMillis = System.currentTimeMillis();
        AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(data, 652);
        Activity requireActivity = this.LIZ.requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        I80.LIZ(aqS157S0100000_7, requireActivity, data.getId(), new AqS14S0200100_7(data, currentTimeMillis, this.LIZ, 1), 24);
        ShortVideoContext shortVideoContext = this.LIZ.LJLJI;
        if (shortVideoContext == null || (creativeFlowData = shortVideoContext.creativeFlowData) == null) {
            return;
        }
        creativeFlowData.setEnterMethod("click_original");
    }
}
