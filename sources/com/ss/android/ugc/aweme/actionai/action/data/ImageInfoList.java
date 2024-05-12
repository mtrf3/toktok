package com.ss.android.ugc.aweme.actionai.action.data;

import X.C61878OQg;
import X.F9E;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ImageInfoList extends F9E {
    public List<Float> c3Feature;
    public List<FaceFeatureV2> faceFeatureV2;
    public MetaCompat meta;
    public List<Float> relation_tag;
    public List<Integer> saliencyMask;
    public ThemeFeature theme_feature;

    public ImageInfoList() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageInfoList copy$default(ImageInfoList imageInfoList, MetaCompat metaCompat, List list, List list2, List list3, ThemeFeature themeFeature, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            metaCompat = imageInfoList.meta;
        }
        if ((i & 2) != 0) {
            list = imageInfoList.c3Feature;
        }
        if ((i & 4) != 0) {
            list2 = imageInfoList.saliencyMask;
        }
        if ((i & 8) != 0) {
            list3 = imageInfoList.faceFeatureV2;
        }
        if ((i & 16) != 0) {
            themeFeature = imageInfoList.theme_feature;
        }
        if ((i & 32) != 0) {
            list4 = imageInfoList.relation_tag;
        }
        return imageInfoList.copy(metaCompat, list, list2, list3, themeFeature, list4);
    }

    public final ImageInfoList copy(MetaCompat meta, List<Float> c3Feature, List<Integer> saliencyMask, List<FaceFeatureV2> faceFeatureV2, ThemeFeature theme_feature, List<Float> relation_tag) {
        o.LJIIIZ(meta, "meta");
        o.LJIIIZ(c3Feature, "c3Feature");
        o.LJIIIZ(saliencyMask, "saliencyMask");
        o.LJIIIZ(faceFeatureV2, "faceFeatureV2");
        o.LJIIIZ(theme_feature, "theme_feature");
        o.LJIIIZ(relation_tag, "relation_tag");
        return new ImageInfoList(meta, c3Feature, saliencyMask, faceFeatureV2, theme_feature, relation_tag);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.meta, this.c3Feature, this.saliencyMask, this.faceFeatureV2, this.theme_feature, this.relation_tag};
    }

    public final List<Float> getC3Feature() {
        return this.c3Feature;
    }

    public final List<FaceFeatureV2> getFaceFeatureV2() {
        return this.faceFeatureV2;
    }

    public final MetaCompat getMeta() {
        return this.meta;
    }

    public final List<Float> getRelation_tag() {
        return this.relation_tag;
    }

    public final List<Integer> getSaliencyMask() {
        return this.saliencyMask;
    }

    public final ThemeFeature getTheme_feature() {
        return this.theme_feature;
    }

    public final void setC3Feature(List<Float> list) {
        o.LJIIIZ(list, "<set-?>");
        this.c3Feature = list;
    }

    public final void setFaceFeatureV2(List<FaceFeatureV2> list) {
        o.LJIIIZ(list, "<set-?>");
        this.faceFeatureV2 = list;
    }

    public final void setMeta(MetaCompat metaCompat) {
        o.LJIIIZ(metaCompat, "<set-?>");
        this.meta = metaCompat;
    }

    public final void setRelation_tag(List<Float> list) {
        o.LJIIIZ(list, "<set-?>");
        this.relation_tag = list;
    }

    public final void setSaliencyMask(List<Integer> list) {
        o.LJIIIZ(list, "<set-?>");
        this.saliencyMask = list;
    }

    public final void setTheme_feature(ThemeFeature themeFeature) {
        o.LJIIIZ(themeFeature, "<set-?>");
        this.theme_feature = themeFeature;
    }

    public ImageInfoList(MetaCompat meta, List<Float> c3Feature, List<Integer> saliencyMask, List<FaceFeatureV2> faceFeatureV2, ThemeFeature theme_feature, List<Float> relation_tag) {
        o.LJIIIZ(meta, "meta");
        o.LJIIIZ(c3Feature, "c3Feature");
        o.LJIIIZ(saliencyMask, "saliencyMask");
        o.LJIIIZ(faceFeatureV2, "faceFeatureV2");
        o.LJIIIZ(theme_feature, "theme_feature");
        o.LJIIIZ(relation_tag, "relation_tag");
        this.meta = meta;
        this.c3Feature = c3Feature;
        this.saliencyMask = saliencyMask;
        this.faceFeatureV2 = faceFeatureV2;
        this.theme_feature = theme_feature;
        this.relation_tag = relation_tag;
    }

    public ImageInfoList(MetaCompat metaCompat, List list, List list2, List list3, ThemeFeature themeFeature, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new MetaCompat(0L, 0L, false, 0L, 0L, null, false, null, null, 0L, 1023, null) : metaCompat, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? C61878OQg.INSTANCE : list2, (i & 8) != 0 ? C61878OQg.INSTANCE : list3, (i & 16) != 0 ? new ThemeFeature(null, null, 3, null) : themeFeature, (i & 32) != 0 ? C61878OQg.INSTANCE : list4);
    }
}
