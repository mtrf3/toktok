package X;

import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import kotlin.jvm.internal.o;

/* renamed from: X.Gwa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43148Gwa extends AbstractC65781Prl implements InterfaceC88472Yns<BeautyMetadata, BeautyMetadata> {
    public static final C43148Gwa LJLIL = new C43148Gwa();

    public C43148Gwa() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final BeautyMetadata invoke(BeautyMetadata beautyMetadata) {
        BeautyMetadata beautyMetadataCopy = beautyMetadata;
        o.LJIIIZ(beautyMetadataCopy, "beautyMetadataCopy");
        BeautyMetadata beautyMetadata2 = new BeautyMetadata();
        beautyMetadata2.setBeautyId(beautyMetadataCopy.getBeautyId());
        beautyMetadata2.setBeautyName(beautyMetadataCopy.getBeautyName());
        beautyMetadata2.setBeautyRes(beautyMetadataCopy.getBeautyRes());
        beautyMetadata2.setBeautyStrength(beautyMetadataCopy.getBeautyStrength());
        beautyMetadata2.setBeautyValid(beautyMetadataCopy.getBeautyValid());
        return beautyMetadata2;
    }
}
