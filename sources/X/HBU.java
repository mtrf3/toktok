package X;

import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.shortvideo.model.RecordStickerSegmentInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HBU extends AbstractC65781Prl implements InterfaceC88472Yns<HBV, C76800UCe> {
    public static final HBU LJLIL = new HBU();

    public HBU() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(HBV hbv) {
        HBV timeSpeedModel = hbv;
        o.LJIIIZ(timeSpeedModel, "$this$timeSpeedModel");
        GreenScreenMaterial.Companion.register(timeSpeedModel);
        LibraryMaterialInfoSv.Companion.getClass();
        timeSpeedModel.LIZ(LibraryMaterialInfoSv.class, "extra_key_library_material");
        RecordStickerSegmentInfo.Companion.register(timeSpeedModel);
        timeSpeedModel.LIZ(String.class, "extra_key_ibe_info");
        timeSpeedModel.LIZ(Integer.TYPE, "prop_customized_pic_cnt");
        timeSpeedModel.LIZ(String.class, "prop_tab_id");
        timeSpeedModel.LIZ(String.class, "stackable_item_list");
        return C76800UCe.LIZ;
    }
}
