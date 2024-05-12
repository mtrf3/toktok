package com.ss.android.ugc.aweme.duetmode.impl;

import X.AbstractC50421Jqb;
import X.AbstractC51036K1g;
import X.C208028Ek;
import X.C208038El;
import X.C51031K1b;
import X.C58096Mr6;
import X.L95;
import X.M89;
import X.M8A;
import X.MGV;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.duetmode.ui.DuetDiscoverAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tools.detail.IDeutModeDiscoverService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DuetDiscoverServiceImpl implements IDeutModeDiscoverService {
    public static IDeutModeDiscoverService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IDeutModeDiscoverService.class, false);
        if (LIZ != null) {
            return (IDeutModeDiscoverService) LIZ;
        }
        if (C58096Mr6.C == null) {
            synchronized (IDeutModeDiscoverService.class) {
                if (C58096Mr6.C == null) {
                    C58096Mr6.C = new DuetDiscoverServiceImpl();
                }
            }
        }
        return C58096Mr6.C;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IDeutModeDiscoverService
    public final String LIZIZ() {
        return L95.LIZ();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8Ek] */
    @Override // com.ss.android.ugc.aweme.tools.detail.IDeutModeDiscoverService
    public final C208028Ek LIZ(final AbstractC51036K1g abstractC51036K1g) {
        return new AbstractC50421Jqb<C208038El, C51031K1b<C208038El>>(abstractC51036K1g) { // from class: X.8Ek
            @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
            public final int getPageType(int i) {
                return i + 17000;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
            {
                this.mModel = (!(abstractC51036K1g instanceof C208038El) || abstractC51036K1g == null) ? new C208038El(null) : abstractC51036K1g;
                this.mPresenter = new C51031K1b();
            }

            @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
            public final void request(int i, M89 feedParam, int i2, boolean z) {
                o.LJIIIZ(feedParam, "feedParam");
                this.mPresenter.LJIILL(Integer.valueOf(i), feedParam.getDuetId(), Integer.valueOf(feedParam.getVideoType()));
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IDeutModeDiscoverService
    public final AmeBaseFragment LIZJ(String str) {
        String LIZ = L95.LIZ();
        if (o.LJ(LIZ, "two_columns")) {
            DuetDiscoverAwemeListFragment duetDiscoverAwemeListFragment = new DuetDiscoverAwemeListFragment();
            duetDiscoverAwemeListFragment.LLILLIZIL = new MGV() { // from class: X.8lC
                public WeakReference<ActivityC45651qj> LJLIL;

                @Override // X.MGV
                public /* bridge */ /* synthetic */ void onJumpToDetail(String str2) {
                    C220408ku.LIZ(this, str2);
                }

                @Override // X.MGV
                public boolean sendCustomRequest(C51031K1b<? extends AbstractC51036K1g<?, ?>> c51031K1b, int i) {
                    return false;
                }

                public final WeakReference<ActivityC45651qj> getActivity() {
                    return this.LJLIL;
                }

                public final void setActivity(WeakReference<ActivityC45651qj> weakReference) {
                    this.LJLIL = weakReference;
                }

                @Override // X.MGV
                public MGX getJumpToVideoParam(MGX param, Aweme aweme) {
                    o.LJIIIZ(param, "param");
                    o.LJIIIZ(aweme, "aweme");
                    param.LIZ = "from_duet_mode";
                    param.LIZIZ = "duet_id";
                    param.LIZJ = "duet_page";
                    return param;
                }

                @Override // X.MGV
                public C51031K1b<? extends AbstractC51036K1g<?, ?>> getPresenter(int i, ActivityC45651qj activityC45651qj) {
                    C51031K1b<? extends AbstractC51036K1g<?, ?>> c51031K1b = new C51031K1b<>();
                    c51031K1b.LJJ(new C208038El(activityC45651qj));
                    return c51031K1b;
                }

                @Override // X.MGV
                public C220538l7 onCreateDetailAwemeViewHolder(final View itemView, final String str2, final MH9 mh9) {
                    o.LJIIIZ(itemView, "itemView");
                    return new C220538l7(itemView, str2, mh9) { // from class: X.8lE
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(itemView, str2, mh9);
                            o.LJIIIZ(itemView, "itemView");
                        }

                        @Override // X.C220538l7
                        public final void a0(Aweme aweme, int i, boolean z, Bundle bundle) {
                            Object obj;
                            if (aweme == null) {
                                return;
                            }
                            super.a0(aweme, i, true, bundle);
                            this.LJLLL.setVisibility(0);
                            if (aweme.getDuettedInfo() == null) {
                                return;
                            }
                            String string = this.LJLJLJ.getString(R.string.ij_);
                            o.LJIIIIZZ(string, "mContext.getString(R.string.music_used)");
                            this.LJLLL.setText(Q8U.LIZIZ(new Object[]{C77123UOp.LJJIIJ(aweme.getDuettedInfo().getOriginalItemDuetCount())}, 1, string, "format(format, *args)"));
                            this.LJLLL.setBackgroundResource(R.drawable.amn);
                            Aweme aweme2 = this.LJLIL;
                            o.LJIIIIZZ(aweme2, "aweme");
                            C188727au c188727au = new C188727au();
                            c188727au.LJIIIZ("duet_tab_name", "suggested");
                            c188727au.LJIIIZ("duet_group_id", aweme2.getGroupId());
                            c188727au.LJIIIZ("original_group_id", aweme2.getDuettedInfo().getOriginalItemId());
                            c188727au.LIZLLL(i, "order");
                            if (bundle == null || (obj = C16880lQ.LLJJIII(bundle, "creation_id")) == null) {
                                obj = "";
                            }
                            c188727au.LJFF(obj, "creation_id");
                            FMX.LJIIL("duet_item_show", c188727au.LIZ);
                        }
                    };
                }
            };
            Bundle m = HiddenActivity$$ExternalSyntheticOutline0.m("extra_challenge_is_hashtag", false, "extra_challenge_hashtag_name", "");
            m.putString("detail_aweme_from", "from_duet_mode");
            m.putString("creation_id", str);
            duetDiscoverAwemeListFragment.setArguments(m);
            return duetDiscoverAwemeListFragment;
        }
        if (o.LJ(LIZ, "full_screen")) {
            M89 m89 = new M89();
            m89.setFrom("from_duet_mode");
            m89.setVideoType(51);
            m89.setEventType(M8A.LIZ("", m89.getFrom(), m89.getEnterFromSub()));
            m89.setCreationId(str);
            Bundle bundle = new Bundle();
            bundle.putSerializable("feed_param", m89);
            DetailFragment detailFragment = new DetailFragment();
            detailFragment.setArguments(bundle);
            return detailFragment;
        }
        return null;
    }
}
