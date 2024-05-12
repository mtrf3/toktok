package com.ss.android.ugc.aweme.nows.service;

import X.AbstractC213048Xs;
import X.AbstractC55082Lja;
import X.C113554cx;
import X.C195627m2;
import X.C195647m4;
import X.C195657m5;
import X.C47261Igj;
import X.C55708Ltg;
import X.C55712Ltk;
import X.C55713Ltl;
import X.OSZ;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.nows.feed.homepage.NowMultiCardFeedViewHolder;
import com.ss.android.ugc.aweme.nows.feed.homepage.NowSingleImageFeedViewHolder;
import com.ss.android.ugc.aweme.nows.feed.homepage.NowSingleVideoFeedViewHolder;
import com.ss.android.ugc.aweme.service.INowCommonFeedService;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowCommonFeedServiceImpl implements INowCommonFeedService {
    @Override // com.ss.android.ugc.aweme.service.INowCommonFeedService
    public final List<Object> LIZ() {
        return C47261Igj.LJJIJIIJI(C55712Ltk.LJ, C55713Ltl.LJ, C55708Ltg.LJ);
    }

    @Override // com.ss.android.ugc.aweme.service.INowCommonFeedService
    public final Map LIZIZ(final Fragment fragment, final AbstractC55082Lja adapter, final String str) {
        o.LJIIIZ(adapter, "adapter");
        o.LJIIIZ(fragment, "fragment");
        if (str != null) {
            return C113554cx.LJJL(new OSZ(28, new AbstractC213048Xs<NowSingleImageFeedViewHolder, C195647m4>(fragment, adapter, str) { // from class: X.8Y1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(fragment, adapter, str);
                    o.LJIIIZ(adapter, "adapter");
                    o.LJIIIZ(fragment, "fragment");
                    o.LJIIIZ(str, "eventType");
                }
            }), new OSZ(29, new AbstractC213048Xs<NowSingleVideoFeedViewHolder, C195657m5>(fragment, adapter, str) { // from class: X.8Y2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(fragment, adapter, str);
                    o.LJIIIZ(adapter, "adapter");
                    o.LJIIIZ(fragment, "fragment");
                    o.LJIIIZ(str, "eventType");
                }
            }), new OSZ(30, new AbstractC213048Xs<NowMultiCardFeedViewHolder, C195627m2>(fragment, adapter, str) { // from class: X.8Y0
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(fragment, adapter, str);
                    o.LJIIIZ(adapter, "adapter");
                    o.LJIIIZ(fragment, "fragment");
                    o.LJIIIZ(str, "eventType");
                }
            }));
        }
        return C113554cx.LJJJLIIL();
    }
}
