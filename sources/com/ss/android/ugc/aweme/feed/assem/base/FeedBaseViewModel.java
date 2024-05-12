package com.ss.android.ugc.aweme.feed.assem.base;

import X.C33Q;
import X.C8YE;
import X.C91G;
import androidx.fragment.app.Fragment;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class FeedBaseViewModel<S extends C33Q> extends AssemViewModelWithItem<S, VideoItemParams> implements C8YE<S, VideoItemParams> {
    public int LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;
    public String LJLJJL;
    public Fragment LJLJJLL;
    public int LJLJL;
    public C91G LJLJLJ;

    public S iv0(S state, VideoItemParams item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return state;
    }

    public VideoItemParams jv0(S state, VideoItemParams item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return item;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ Object b50(C33Q c33q, Object obj) {
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        jv0(c33q, videoItemParams);
        return videoItemParams;
    }

    @Override // X.C8YE
    /* renamed from: hv0, reason: merged with bridge method [inline-methods] */
    public final S HU(S state, VideoItemParams item, List<? extends Object> list) {
        C91G c91g;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        this.LJLILLLLZI = item.mPageType;
        this.LJLJI = item.mEventType;
        this.LJLJJI = item.isMyProfile;
        this.LJLJJL = item.mEnterMethodValue;
        this.LJLJJLL = item.fragment;
        this.LJLJL = item.mAwemeFromPage;
        if (list != null) {
            for (Object obj : list) {
                if (obj instanceof C91G) {
                    c91g = (C91G) obj;
                    break;
                }
            }
        }
        c91g = null;
        this.LJLJLJ = c91g;
        return iv0(state, item);
    }
}
