package X;

import Y.ARunnableS19S0300000_8;
import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JfM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49724JfM {
    public static int LIZJ;
    public static int LIZLLL;
    public static final C49724JfM LIZ = new C49724JfM();
    public static final C73318Sq2 LIZIZ = new C73318Sq2();
    public static final int LJ = C49735JfX.LIZ.preOffset;

    public static void LIZ(Context context, C8HS c8hs, C49710Jf8 c49710Jf8) {
        if ((((Number) C50874Jxu.LIZ.getValue()).intValue() != 0 || C49735JfX.LIZ.enable_pre_load) && c49710Jf8 != null) {
            c49710Jf8.LJIIJJI(new C49725JfN(context, c8hs, c49710Jf8));
        }
    }

    public static void LIZIZ(int i, Context context, List list) {
        String str;
        String bulletSchema;
        int i2 = LIZJ;
        if (i2 > i) {
            return;
        }
        while (true) {
            if (i2 < list.size()) {
                SearchMixFeed searchMixFeed = (SearchMixFeed) ListProtector.get(list, i2);
                if (searchMixFeed.getFeedType() == 65514) {
                    DynamicPatch LJI = searchMixFeed.LJI();
                    String str2 = null;
                    if (LJI != null) {
                        str = LJI.getBulletSchema();
                    } else {
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        DynamicPatch LJI2 = searchMixFeed.LJI();
                        if (LJI2 != null) {
                            bulletSchema = LJI2.schema;
                        }
                    } else {
                        DynamicPatch LJI3 = searchMixFeed.LJI();
                        if (LJI3 != null) {
                            bulletSchema = LJI3.getBulletSchema();
                        }
                    }
                    if (bulletSchema != null) {
                        if (C49735JfX.LIZ.enableSingleThread) {
                            C49724JfM c49724JfM = LIZ;
                            DynamicPatch LJI4 = searchMixFeed.LJI();
                            if (LJI4 != null) {
                                str2 = LJI4.getRawData();
                            }
                            c49724JfM.getClass();
                            LIZLLL(context, bulletSchema, str2);
                        } else {
                            C49724JfM c49724JfM2 = LIZ;
                            DynamicPatch LJI5 = searchMixFeed.LJI();
                            if (LJI5 != null) {
                                str2 = LJI5.getRawData();
                            }
                            c49724JfM2.getClass();
                            try {
                                C3C5.m7constructorimpl(Boolean.valueOf(LIZIZ.LIZ(AbstractC73672Svk.LJIIJ(new C49776JgC(c49724JfM2, bulletSchema, context, str2)).LJJL(T16.LIZIZ).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9FW
                                    @Override // X.InterfaceC64592gB
                                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                    }
                                }, new InterfaceC64592gB() { // from class: X.9FX
                                    @Override // X.InterfaceC64592gB
                                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                                    }
                                }))));
                            } catch (Throwable th) {
                                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                            }
                        }
                    }
                }
            }
            if (i2 != i) {
                i2++;
            } else {
                return;
            }
        }
    }

    public static void LIZJ(Context context, C8HS c8hs, RecyclerView recyclerView) {
        List data;
        o.LJIIIZ(context, "context");
        int i = 0;
        if (((Number) C50874Jxu.LIZ.getValue()).intValue() == 0 && !C49735JfX.LIZ.enable_pre_load) {
            return;
        }
        C0A2 c0a2 = null;
        if (recyclerView != null) {
            c0a2 = recyclerView.getLayoutManager();
        }
        if (c0a2 instanceof LinearLayoutManager) {
            int LLILLJJLI = ((LinearLayoutManager) c0a2).LLILLJJLI();
            if (c8hs != null && (data = c8hs.getData()) != null) {
                LIZ.getClass();
                if (LLILLJJLI >= 0) {
                    i = LLILLJJLI;
                }
                C76732zl c76732zl = new C76732zl();
                int i2 = LJ + i;
                c76732zl.element = i2;
                if (i2 >= data.size()) {
                    c76732zl.element = data.size() - 1;
                }
                int i3 = LIZLLL;
                if (i3 != 0 && i3 < data.size()) {
                    LIZLLL = data.size();
                    c76732zl.element++;
                }
                int i4 = c76732zl.element;
                if (i4 <= 0) {
                    return;
                }
                LIZJ = i;
                if (C49735JfX.LIZ.enableSingleThread) {
                    C38995FSd.LIZJ().execute(new ARunnableS19S0300000_8(data, c76732zl, context, 7));
                } else {
                    LIZIZ(i4, context, data);
                }
            }
        }
    }

    public static void LIZLLL(Context context, String schema, String str) {
        o.LJIIIZ(schema, "schema");
        C50102JlS.LJIILL.put(schema, 2);
        o.LJIIIZ(context, "context");
        if (TextUtils.isEmpty(schema) || C00F.LIZ(31744, 1, "total_search_lynx_preload", true) != 1) {
            return;
        }
        C50804Jwm.LIZLLL(context, schema, str, false, null, 56);
    }
}
