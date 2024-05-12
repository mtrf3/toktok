package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.FilterCategoryExtra;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WQj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82265WQj {
    public static final C82273WQr LIZ = new C82273WQr("", "");

    public static final C79155V4t LIZIZ(FilterBean filterBean) {
        o.LJIIIZ(filterBean, "filterBean");
        int id = filterBean.getId();
        String resId = filterBean.getResId();
        o.LJIIIIZZ(resId, "filterBean.resId");
        String extra = filterBean.getExtra();
        String name = filterBean.getName();
        o.LJIIIIZZ(name, "filterBean.name");
        String categoryKey = filterBean.getCategoryKey();
        o.LJIIIIZZ(categoryKey, "filterBean.categoryKey");
        String enName = filterBean.getEnName();
        ToolsUrlModel resource = filterBean.getResource();
        List<String> tags = filterBean.getTags();
        o.LJIIIIZZ(tags, "filterBean.tags");
        return new C79155V4t(id, resId, name, categoryKey, enName, resource, tags, filterBean.getTagUpdateAt(), filterBean.getThumbnailFileUri(), extra);
    }

    public static final C79155V4t LIZ(Effect effect, String categoryName) {
        int i;
        String str;
        Object LIZ2;
        String str2;
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(categoryName, "categoryName");
        try {
            i = CastIntegerProtector.parseInt(effect.getEffectId());
        } catch (Exception unused) {
            i = -1;
        }
        String resourceId = effect.getResourceId();
        String extra = effect.getExtra();
        String name = effect.getName();
        List<String> tags = effect.getTags();
        Object obj = null;
        if (tags != null && !tags.isEmpty()) {
            for (String str3 : tags) {
                if (ujb.o.LJJJLIIL(str3, "pinyin:", false)) {
                    str = str3.substring(7);
                    o.LJIIIIZZ(str, "(this as java.lang.String).substring(startIndex)");
                    break;
                }
            }
        }
        str = null;
        UrlModel LJIL = C78963Uyt.LJIL(effect.getFileUrl());
        ToolsUrlModel toolsUrlModel = new ToolsUrlModel();
        toolsUrlModel.uri = LJIL.getUri();
        toolsUrlModel.urlList = LJIL.getUrlList();
        List<String> tags2 = effect.getTags();
        if (tags2 == null) {
            tags2 = new ArrayList<>();
        }
        String tagsUpdatedAt = effect.getTagsUpdatedAt();
        try {
            List<String> urlList = effect.getIconUrl().getUrlList();
            if (urlList != null) {
                str2 = (String) ListProtector.get(urlList, 0);
            } else {
                str2 = null;
            }
            LIZ2 = UriProtector.parse(str2);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (!C3C5.m12isFailureimpl(LIZ2)) {
            obj = LIZ2;
        }
        return new C79155V4t(i, resourceId, name, categoryName, str, toolsUrlModel, tags2, tagsUpdatedAt, (android.net.Uri) obj, extra);
    }

    public static final java.util.Map<EffectCategoryResponse, List<FilterBean>> LIZJ(C82237WPh filterData, java.util.Map<Integer, C82268WQm> filterInfoCache) {
        o.LJIIIZ(filterData, "filterData");
        o.LJIIIZ(filterInfoCache, "filterInfoCache");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (OSZ<EffectCategoryResponse, List<C79155V4t>> osz : filterData.LJLILLLLZI) {
            ArrayList arrayList = new ArrayList();
            for (C79155V4t c79155V4t : osz.getSecond()) {
                FilterBean filterBean = new FilterBean();
                LJFF(filterBean, c79155V4t);
                C82268WQm c82268WQm = filterInfoCache.get(Integer.valueOf(c79155V4t.LIZ));
                if (c82268WQm != null) {
                    LJ(c82268WQm, filterBean);
                }
                LIZLLL(osz.getFirst(), filterBean);
                arrayList.add(filterBean);
            }
            linkedHashMap.put(osz.getFirst(), arrayList);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZLLL(EffectCategoryResponse categoryResponse, FilterBean filterBean) {
        FilterCategoryExtra filterCategoryExtra;
        o.LJIIIZ(categoryResponse, "categoryResponse");
        try {
            filterCategoryExtra = (FilterCategoryExtra) new Gson().LJI(categoryResponse.getExtra(), FilterCategoryExtra.class);
        } catch (Exception unused) {
            filterCategoryExtra = new FilterCategoryExtra(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        filterBean.setCategoryExtra(filterCategoryExtra);
    }

    public static final void LJ(C82268WQm c82268WQm, FilterBean filterBean) {
        o.LJIIIZ(filterBean, "filterBean");
        filterBean.setFilterFilePath(c82268WQm.LJLJI);
        filterBean.setFilterFolder(c82268WQm.LJLJJI);
    }

    public static final void LJFF(FilterBean filterBean, C79155V4t filterMeta) {
        o.LJIIIZ(filterMeta, "filterMeta");
        filterBean.setId(filterMeta.LIZ);
        filterBean.setResId(filterMeta.LIZIZ);
        filterBean.setExtra(filterMeta.LJIIIZ);
        filterBean.setName(filterMeta.LIZJ);
        filterBean.setCategoryKey(filterMeta.LIZLLL);
        filterBean.setEnName(filterMeta.LJ);
        filterBean.setResource(filterMeta.LJFF);
        filterBean.setTags(filterMeta.LJI);
        filterBean.setTagUpdateAt(filterMeta.LJII);
        filterBean.setThumbnailFileUri(filterMeta.LJIIIIZZ);
    }

    public static final C82268WQm LJI(FilterBean filterBean, EnumC82260WQe state) {
        o.LJIIIZ(state, "state");
        int id = filterBean.getId();
        String filterFilePath = filterBean.getFilterFilePath();
        o.LJIIIIZZ(filterFilePath, "filterFilePath");
        String filterFolder = filterBean.getFilterFolder();
        o.LJIIIIZZ(filterFolder, "filterFolder");
        return new C82268WQm(id, state, filterFilePath, filterFolder);
    }
}
