package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import kotlin.jvm.internal.o;

/* renamed from: X.HDp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43713HDp implements InterfaceC46115I7z {
    public static final /* synthetic */ int LJFF = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final CreativeFlowData LIZLLL;
    public final boolean LJ;

    public /* synthetic */ C43713HDp() {
        this("", "", "", null, false);
    }

    @Override // X.InterfaceC46115I7z
    public final void LJ() {
        C43714HDq LJI = LJI(this);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", LJI.getEnterFrom());
        c145995oB.LJI("enter_method", LJI.getEnterMethod());
        c145995oB.LJI("creation_id", LJI.getCreationId());
        c145995oB.LJI("shoot_way", LJI.getShootWay());
        c145995oB.LJI("is_through_anchor", LJI.isThroughAnchor());
        c145995oB.LJI("library_entry_point", LJI.getLibraryEntryPoint());
        c145995oB.LIZLLL("library_category_name", "library_page");
        FMX.LJIIL("library_category_show", c145995oB.LIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCategoryShow -> enterFrom = ");
        LIZ.append(LJI.getEnterFrom());
        LIZ.append(" creationId = ");
        LIZ.append(LJI.getCreationId());
        LIZ.append(" shootWay = ");
        LIZ.append(LJI.getShootWay());
        LIZ.append(" last_library_category = ");
        LIZ.append("library_page");
        H7B.LIZIZ("MobLibrary", X1D.LIZIZ(LIZ));
    }

    public final void LJIIIIZZ() {
        C43714HDq LJI = LJI(this);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", LJI.getEnterFrom());
        c145995oB.LJI("enter_method", LJI.getEnterMethod());
        c145995oB.LJI("creation_id", LJI.getCreationId());
        c145995oB.LJI("shoot_way", LJI.getShootWay());
        c145995oB.LJI("is_through_anchor", LJI.isThroughAnchor());
        c145995oB.LJI("library_entry_point", LJI.getLibraryEntryPoint());
        FMX.LJIIL("library_entrance_show", c145995oB.LIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("library_entrance_show -> enterFrom = ");
        LIZ.append(LJI.getEnterFrom());
        LIZ.append(" enterMethod = ");
        LIZ.append(LJI.getEnterMethod());
        LIZ.append(" creationId = ");
        LIZ.append(LJI.getCreationId());
        LIZ.append(" shootWay = ");
        LIZ.append(LJI.getShootWay());
        LIZ.append(" isThroughAnchor = ");
        LIZ.append(LJI.isThroughAnchor());
        LIZ.append(" libraryEntryPoint = ");
        LIZ.append(LJI.getLibraryEntryPoint());
        H7B.LIZIZ("MobLibrary", X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C43713HDp(ShortVideoContext shortVideoContext) {
        this("video_shoot_page", shortVideoContext.shootWay, shortVideoContext.LJI(), shortVideoContext.creativeFlowData, false);
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
    }

    public static C43714HDq LJI(C43713HDp c43713HDp) {
        String str;
        String str2;
        if (c43713HDp.LJ) {
            return new C43714HDq("video_edit_page", "click_original", c43713HDp.LIZIZ, c43713HDp.LIZJ, false, CardStruct.IStatusCode.DEFAULT, null, 64, null);
        }
        String str3 = c43713HDp.LIZ;
        CreativeFlowData creativeFlowData = c43713HDp.LIZLLL;
        if (creativeFlowData == null || (str = creativeFlowData.getEnterMethod()) == null) {
            str = "";
        }
        String str4 = c43713HDp.LIZIZ;
        String str5 = c43713HDp.LIZJ;
        CreativeFlowData creativeFlowData2 = c43713HDp.LIZLLL;
        if (creativeFlowData2 == null || (str2 = Integer.valueOf(creativeFlowData2.isThroughAnchor() ? 1 : 0).toString()) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        return new C43714HDq(str3, str, str4, str5, false, str2, null, 64, null);
    }

    public static String LJII(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "video";
            }
            if (num.intValue() == 2) {
                return "gif";
            }
        }
        return null;
    }

    @Override // X.InterfaceC46115I7z
    public final void LIZ(String str) {
        C43714HDq LJI = LJI(this);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", LJI.getEnterFrom());
        c145995oB.LJI("enter_method", LJI.getEnterMethod());
        c145995oB.LJI("creation_id", LJI.getCreationId());
        c145995oB.LJI("shoot_way", LJI.getShootWay());
        c145995oB.LJI("is_through_anchor", LJI.isThroughAnchor());
        c145995oB.LJI("library_entry_point", LJI.getLibraryEntryPoint());
        c145995oB.LJI("library_category_name", str);
        FMX.LJIIL("click_library_category", c145995oB.LIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCategoryClick -> enterFrom = ");
        LIZ.append(LJI.getEnterFrom());
        LIZ.append(" creationId = ");
        LIZ.append(LJI.getCreationId());
        LIZ.append(" shootWay = ");
        LIZ.append(LJI.getShootWay());
        LIZ.append(" last_library_category = ");
        LIZ.append(str);
        H7B.LIZIZ("MobLibrary", X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C43713HDp(VideoPublishEditModel videoPublishEditModel) {
        this("video_edit_page", videoPublishEditModel.mShootWay, videoPublishEditModel.getCreationId(), videoPublishEditModel.creativeFlowData, false);
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
    }

    @Override // X.InterfaceC46115I7z
    public final void LIZJ(String str, String str2) {
        C43714HDq LJI = LJI(this);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("impression_id", str);
        c145995oB.LJI("shoot_way", LJI.getShootWay());
        c145995oB.LJI("creation_id", LJI.getCreationId());
        c145995oB.LJI("result_is_null", str2);
        c145995oB.LJI("is_through_anchor", LJI.isThroughAnchor());
        FMX.LJIIL("library_item_load", c145995oB.LIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLibraryItemLoad -> impressionId = ");
        LIZ.append(str);
        LIZ.append(" shootWay = ");
        LIZ.append(LJI.getShootWay());
        LIZ.append(" creationId = ");
        LIZ.append(LJI.getCreationId());
        LIZ.append(" resultIsNull = ");
        LIZ.append(str2);
        LIZ.append(" isThroughAnchor ");
        LIZ.append(LJI.isThroughAnchor());
        H7B.LIZIZ("MobLibrary", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC46115I7z
    public final void LJFF(String str, String str2, String str3) {
        C43714HDq LJI = LJI(this);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("impression_id", str);
        c145995oB.LJI("enter_from", LJI.getEnterFrom());
        c145995oB.LJI("shoot_way", LJI.getShootWay());
        c145995oB.LJI("creation_id", LJI.getCreationId());
        c145995oB.LJI("result_is_null", str2);
        c145995oB.LJI("is_through_anchor", LJI.isThroughAnchor());
        c145995oB.LJI("search_keyword", str3);
        FMX.LJIIL("library_search", c145995oB.LIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLibrarySearch -> impressionId = ");
        LIZ.append(str);
        LIZ.append(" enterFrom = ");
        LIZ.append(LJI.getEnterFrom());
        LIZ.append(" shootWay = ");
        LIZ.append(LJI.getShootWay());
        LIZ.append(" creationId = ");
        LIZ.append(LJI.getCreationId());
        LIZ.append(" resultIsNull = ");
        LIZ.append(str2);
        LIZ.append(" isThroughAnchor = ");
        LIZ.append(LJI.isThroughAnchor());
        LIZ.append(" searchKeyword = ");
        LIZ.append(str3);
        H7B.LIZIZ("MobLibrary", X1D.LIZIZ(LIZ));
    }

    public C43713HDp(String str, String str2, String str3, CreativeFlowData creativeFlowData, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = creativeFlowData;
        this.LJ = z;
    }

    @Override // X.InterfaceC46115I7z
    public final void LIZIZ(String str, String str2, Integer num, String str3, Integer num2, Integer num3, boolean z, String str4) {
        String str5;
        int i;
        int i2;
        C43714HDq LJI = LJI(this);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("impression_id", str);
        c145995oB.LJI("library_material_id", str2);
        c145995oB.LJI("shoot_way", LJI.getShootWay());
        c145995oB.LJI("creation_id", LJI.getCreationId());
        c145995oB.LJI("library_material_type", LJII(num));
        c145995oB.LJI("library_content_source", str3);
        String str6 = "1";
        if (z) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("is_library_search_result", str5);
        c145995oB.LJI("is_through_anchor", LJI.isThroughAnchor());
        c145995oB.LIZ(this.LJ ? 1 : 0, "is_editor_pro");
        c145995oB.LJI("library_category_name", str4);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(num2);
        LIZ.append('/');
        LIZ.append(num3);
        c145995oB.LJI("library_material_aspect_ratio", X1D.LIZIZ(LIZ));
        int i3 = 1;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 1;
        }
        if (num3 != null) {
            i2 = num3.intValue();
        } else {
            i2 = 1;
        }
        if (i <= i2 || !H7X.LIZ()) {
            i3 = 0;
        }
        c145995oB.LIZ(i3, "is_library_material_black_bar");
        FMX.LJIIL("library_item_show", c145995oB.LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onLibraryItemShow -> impressionId = ");
        LIZ2.append(str);
        LIZ2.append(" materialId = ");
        LIZ2.append(str2);
        LIZ2.append(" shootWay = ");
        LIZ2.append(LJI.getShootWay());
        LIZ2.append(" creationId = ");
        LIZ2.append(LJI.getCreationId());
        LIZ2.append(" materialType = ");
        LIZ2.append(num);
        C1DI.LIZIZ(LIZ2, " contentSource = ", str3, " isSearchResult = ");
        if (!z) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.append(str6);
        LIZ2.append(" isThroughAnchor = ");
        LIZ2.append(LJI.isThroughAnchor());
        LIZ2.append(" is_editor_pro = ");
        LIZ2.append(this.LJ);
        LIZ2.append(" last_library_category = ");
        LIZ2.append(str4);
        H7B.LIZIZ("MobLibrary", X1D.LIZIZ(LIZ2));
    }

    @Override // X.InterfaceC46115I7z
    public final void LIZLLL(String str, Integer num, String str2, Integer num2, String str3, Integer num3, Integer num4, boolean z, String str4, String str5) {
        String str6;
        int i;
        int i2;
        C43714HDq LJI = LJI(this);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("impression_id", str);
        c145995oB.LIZJ(num, "impr_pos");
        c145995oB.LJI("library_material_id", str2);
        c145995oB.LJI("shoot_way", LJI.getShootWay());
        c145995oB.LJI("creation_id", LJI.getCreationId());
        c145995oB.LJI("enter_from", LJI.getEnterFrom());
        c145995oB.LJI("library_material_type", LJII(num2));
        c145995oB.LJI("library_content_source", str3);
        String str7 = "1";
        if (z) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("is_library_search_result", str6);
        c145995oB.LJI("is_through_anchor", LJI.isThroughAnchor());
        c145995oB.LJI("enter_method", LJI.getEnterMethod());
        c145995oB.LIZ(this.LJ ? 1 : 0, "is_editor_pro");
        c145995oB.LJI("library_category_name", str5);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(num3);
        LIZ.append('/');
        LIZ.append(num4);
        c145995oB.LJI("library_material_aspect_ratio", X1D.LIZIZ(LIZ));
        int i3 = 1;
        if (num3 != null) {
            i = num3.intValue();
        } else {
            i = 1;
        }
        if (num4 != null) {
            i2 = num4.intValue();
        } else {
            i2 = 1;
        }
        if (i <= i2 || !H7X.LIZ()) {
            i3 = 0;
        }
        c145995oB.LIZ(i3, "is_library_material_black_bar");
        c145995oB.LJI("action_type", str4);
        FMX.LJIIL("library_item_click", c145995oB.LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onLibraryItemClick -> impressionId = ");
        LIZ2.append(str);
        LIZ2.append(" imprPosition = ");
        LIZ2.append(num);
        LIZ2.append(" libraryMaterialId = ");
        LIZ2.append(str2);
        LIZ2.append(" shootWay = ");
        LIZ2.append(LJI.getShootWay());
        LIZ2.append(" creationId = ");
        LIZ2.append(LJI.getCreationId());
        LIZ2.append(" libraryMaterialType = ");
        LIZ2.append(num2);
        LIZ2.append(" contentSource = ");
        LIZ2.append(str3);
        LIZ2.append(" isSearchResult = ");
        if (!z) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.append(str7);
        LIZ2.append(" isThroughAnchor = ");
        LIZ2.append(LJI.isThroughAnchor());
        LIZ2.append(" is_editor_pro = ");
        LIZ2.append(this.LJ);
        LIZ2.append(" last_library_category = ");
        LIZ2.append(str5);
        H7B.LIZIZ("MobLibrary", X1D.LIZIZ(LIZ2));
    }
}
