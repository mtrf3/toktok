package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS31S0100100_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hwm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45708Hwm implements InterfaceC81972WFc {
    public final /* synthetic */ WID LIZ;

    @Override // X.InterfaceC81972WFc
    public final void LIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZIZ(C81975WFf c81975WFf) {
    }

    public C45708Hwm(WID wid) {
        this.LIZ = wid;
    }

    @Override // X.InterfaceC81972WFc
    public final boolean LIZJ(C81975WFf c81975WFf) {
        String str;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", this.LIZ.LJIILIIL().shootWay);
        c145995oB.LJI("creation_id", this.LIZ.LJIILIIL().LJI());
        LibraryMaterialInfoSv libraryMaterialInfoSv = this.LIZ.LJIILIIL().libraryContext.libraryMaterialInfo;
        if (libraryMaterialInfoSv == null || (str = libraryMaterialInfoSv.getId()) == null) {
            str = "";
        }
        c145995oB.LJI("library_material_id", str);
        c145995oB.LJI("icon_status", "off");
        GXR.LIZ("library_add_icon_show", c145995oB.LIZ);
        c81975WFf.LJLJI = R.raw.icon_camera_library_fill;
        c81975WFf.LJLLLLLL = R.string.px2;
        c81975WFf.LJLJJL = null;
        c81975WFf.LJLJLJ = false;
        LibraryMaterialInfoSv libraryMaterialInfoSv2 = this.LIZ.LJIILIIL().libraryContext.libraryMaterialInfo;
        if (libraryMaterialInfoSv2 != null) {
            libraryMaterialInfoSv2.setLibraryMaterialConsumed(true);
        }
        ((InterfaceC82062WIo) this.LIZ.LIZ.LJ(InterfaceC82062WIo.class, null)).LL(c81975WFf);
        return true;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        String str;
        EnumC45707Hwl enumC45707Hwl;
        String str2;
        o.LJIIIZ(view, "view");
        long LJIILIIL = this.LIZ.LJIILIIL().LJIILIIL() - this.LIZ.LJIILIIL().LJIIIIZZ();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", this.LIZ.LJIILIIL().shootWay);
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("creation_id", this.LIZ.LJIILIIL().LJI());
        c145995oB.LJI("content_source", "shoot");
        c145995oB.LJI("content_type", "video");
        if (this.LIZ.LJIILIIL().libraryContext.libraryMaterialInfo != null) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("is_through_anchor", str);
        GXR.LIZ("click_library_entrance", c145995oB.LIZ);
        if (this.LIZ.LJIILIIL().libraryContext.libraryMaterialCount >= 10) {
            C78920UyC.LIZLLL(R.string.hru, this.LIZ.LIZ(), 3061);
            return;
        }
        if (LJIILIIL < 500) {
            C78920UyC.LIZLLL(R.string.hrs, this.LIZ.LIZ(), 3062);
            return;
        }
        C78934UyQ.LJLIL.LIZLLL().getClass();
        if (CommonFeedApiService.LIZ().LJIILJJIL()) {
            if (c81975WFf.LJLJLJ) {
                long currentTimeMillis = System.currentTimeMillis();
                AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(this.LIZ, 669);
                ActivityC45651qj LIZ = this.LIZ.LIZ();
                LibraryMaterialInfoSv libraryMaterialInfoSv = this.LIZ.LJIILIIL().libraryContext.libraryMaterialInfo;
                if (libraryMaterialInfoSv == null || (str2 = libraryMaterialInfoSv.getId()) == null) {
                    str2 = "";
                }
                I80.LIZ(aqS157S0100000_7, LIZ, str2, new AqS31S0100100_7(this.LIZ, currentTimeMillis, 1), 24);
                return;
            }
            ((InterfaceC44303Ha7) this.LIZ.LJJI.getValue()).gm0(this.LIZ.LJIILIIL(), EnumC45707Hwl.GRID_VIEW, null);
            System.currentTimeMillis();
            return;
        }
        C78934UyQ.LJLIL.LIZLLL().getClass();
        if (!CommonFeedApiService.LIZ().LJIILIIL()) {
            return;
        }
        InterfaceC44303Ha7 interfaceC44303Ha7 = (InterfaceC44303Ha7) this.LIZ.LJJI.getValue();
        ShortVideoContext LJIILIIL2 = this.LIZ.LJIILIIL();
        if (c81975WFf.LJLJLJ) {
            enumC45707Hwl = EnumC45707Hwl.GRID_VIEW_WITH_CARD;
        } else {
            enumC45707Hwl = EnumC45707Hwl.GRID_VIEW;
        }
        interfaceC44303Ha7.gm0(LJIILIIL2, enumC45707Hwl, this.LIZ.LJIILIIL().libraryContext.libraryMaterialInfo);
        System.currentTimeMillis();
    }
}
