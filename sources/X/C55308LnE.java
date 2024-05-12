package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

/* renamed from: X.LnE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55308LnE extends C1CZ {
    public final /* synthetic */ DetailFragmentPanel LJLIL;

    public C55308LnE(DetailFragmentPanel detailFragmentPanel) {
        this.LJLIL = detailFragmentPanel;
    }

    @Override // X.C1CZ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
        if (i != 0 || Objects.equals(this.LJLIL.param.getFrom(), "from_publishing_video")) {
            return;
        }
        this.LJLIL.LJLLLL();
        this.LJLIL.mDialogController.LJIIL();
        if (Z9N.LIZIZ.LLL(this.LJLIL.getEventType())) {
            DetailFragmentPanel detailFragmentPanel = this.LJLIL;
            if (detailFragmentPanel.LJZ != null) {
                C80796VnM c80796VnM = detailFragmentPanel.mViewPager;
                c80796VnM.getClass();
                C80815Vnf LJIJJ = c80796VnM.LJIJJ(c80796VnM.LJLLL);
                if (LJIJJ != null && Math.abs(LJIJJ.LJ) >= 10) {
                    C36922EeM.LIZLLL(4, "VerticalViewPager_YCH", "start reset viewPagerOffset");
                    int i2 = 0;
                    LJIJJ.LJ = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 < c80796VnM.LJLL.size()) {
                            if (ListProtector.get(c80796VnM.LJLL, i3) == LJIJJ) {
                                break;
                            } else {
                                i3++;
                            }
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if (i3 != -1) {
                        int i4 = 0;
                        for (int i5 = i3 - 1; i5 >= 0; i5--) {
                            i4--;
                            ((C80815Vnf) ListProtector.get(c80796VnM.LJLL, i5)).LJ = i4;
                        }
                        for (int i6 = i3 + 1; i6 < c80796VnM.LJLL.size(); i6++) {
                            i2++;
                            ((C80815Vnf) ListProtector.get(c80796VnM.LJLL, i6)).LJ = i2;
                        }
                    }
                    c80796VnM.LLJ = true;
                    c80796VnM.requestLayout();
                }
            }
        }
    }

    @Override // X.C1CZ, X.C0C3
    public final void onPageSelected(int i) {
        long j;
        C2U8.LIZ(new C46276IEe(10, 0));
        DetailFragmentPanel detailFragmentPanel = this.LJLIL;
        if (!detailFragmentPanel.isFirst) {
            String from = detailFragmentPanel.param.getFrom();
            if (TextUtils.equals(from, "from_follow_page") || TextUtils.equals(from, "from_familiar_tab") || TextUtils.equals(from, "from_nearby") || TextUtils.equals("from_search_live", from)) {
                Aweme O1 = this.LJLIL.O1();
                String from2 = this.LJLIL.param.getFrom();
                int videoType = this.LJLIL.param.getVideoType();
                String eventType = this.LJLIL.param.getEventType();
                IDP idp = this.LJLIL.mPlayerController;
                if (idp != null) {
                    j = idp.LJJJJI(JHI.LIZ().LIZIZ);
                } else {
                    j = -1;
                }
                C50419JqZ.LIZJ(O1, from2, videoType, eventType, j, true, -1, null);
            }
        }
        if (this.LJLIL.param.isfollowSkyLight()) {
            Aweme currentAweme = this.LJLIL.getCurrentAweme();
            if (currentAweme == null && (currentAweme = ((AbstractC55082Lja) this.LJLIL.getViewPager().getAdapter()).getItem(i)) == null) {
                return;
            }
            User author = currentAweme.getAuthor();
            if (author.getUniqueId() == null) {
                ((TextView) this.LJLIL.LLFII.findViewById(R.id.dmf)).setText("");
            } else {
                ((TextView) this.LJLIL.LLFII.findViewById(R.id.dmf)).setText(author.getUniqueId());
            }
            DetailFragmentPanel detailFragmentPanel2 = this.LJLIL;
            detailFragmentPanel2.mAdapter.LJLLLL = detailFragmentPanel2.param.isHasLatestFollowingUser();
            String uid = author.getUid();
            String aid = currentAweme.getAid();
            this.LJLIL.LLJIJIL = TextUtils.equals((CharSequence) ((LinkedHashMap) LYS.LIZ).get(uid), aid);
            this.LJLIL.LLJILJIL = TextUtils.equals((CharSequence) ((LinkedHashMap) LYS.LIZIZ).get(uid), aid);
            if (!this.LJLIL.LLIL.contains(uid)) {
                this.LJLIL.LLIL.add(uid);
                List<String> uidList = this.LJLIL.param.getUidList();
                List<String> blueDotList = this.LJLIL.param.getBlueDotList();
                int i2 = 0;
                while (true) {
                    if (i2 >= uidList.size()) {
                        break;
                    }
                    if (((String) ListProtector.get(uidList, i2)).equalsIgnoreCase(uid)) {
                        if (((String) ListProtector.get(blueDotList, i2)).equalsIgnoreCase("true")) {
                            C2U8.LIZ(new C54426LXq(uid));
                        }
                    } else {
                        i2++;
                    }
                }
            }
            this.LJLIL.LLIIZ.add(aid);
        }
        Aweme currentAweme2 = this.LJLIL.getCurrentAweme();
        if (currentAweme2 == null) {
            currentAweme2 = ((AbstractC55082Lja) this.LJLIL.getViewPager().getAdapter()).getItem(i);
        }
        if (this.LJLIL.param.getVideoCollectionId() != null && currentAweme2 != null) {
            currentAweme2.appendMobParam("collection_id", this.LJLIL.param.getVideoCollectionId());
        }
        if (this.LJLIL.param.getVideoCollectionName() != null && currentAweme2 != null) {
            currentAweme2.appendMobParam("collection_name", this.LJLIL.param.getVideoCollectionName());
        }
        if (Z9N.LIZIZ.LLLLLZ(this.LJLIL.getContext())) {
            this.LJLIL.LJLLLL();
        }
    }

    @Override // X.C1CZ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        boolean z;
        Aweme item;
        float max;
        float max2;
        DetailFragmentPanel detailFragmentPanel = this.LJLIL;
        if (f != 0.0f) {
            int count = detailFragmentPanel.mAdapter.getCount();
            int i3 = detailFragmentPanel.mCurIndex;
            if (count <= i3 + 1) {
                return;
            }
            if (i3 == i) {
                z = true;
            } else {
                z = false;
            }
            float f2 = f - 0.5f;
            Aweme item2 = detailFragmentPanel.mAdapter.getItem(i3);
            if (z) {
                item = detailFragmentPanel.mAdapter.getItem(detailFragmentPanel.mCurIndex + 1);
            } else {
                item = detailFragmentPanel.mAdapter.getItem(i);
            }
            if (item2 == null || item == null || item2.getAwemeType() == item.getAwemeType()) {
                return;
            }
            if (item2.getAwemeType() != 101 && item.getAwemeType() != 101) {
                return;
            }
            if (item2.getAwemeType() == 101) {
                if (z) {
                    max2 = Math.max(f2, 0.0f);
                } else {
                    max2 = Math.max(0.5f - f, 0.0f);
                }
                C55280Lmm c55280Lmm = detailFragmentPanel.LLIILZL;
                if (c55280Lmm != null) {
                    c55280Lmm.LIZ(max2 * 2.0f);
                }
                InterfaceC55317LnN interfaceC55317LnN = detailFragmentPanel.LLII;
                if (interfaceC55317LnN == null) {
                    return;
                }
                interfaceC55317LnN.ml(max2 * 2.0f);
                return;
            }
            if (item.getAwemeType() != 101) {
                return;
            }
            if (z) {
                max = Math.max(0.5f - f, 0.0f);
            } else {
                max = Math.max(f2, 0.0f);
            }
            C55280Lmm c55280Lmm2 = detailFragmentPanel.LLIILZL;
            if (c55280Lmm2 != null) {
                c55280Lmm2.LIZ(max * 2.0f);
            }
            InterfaceC55317LnN interfaceC55317LnN2 = detailFragmentPanel.LLII;
            if (interfaceC55317LnN2 == null) {
                return;
            }
            interfaceC55317LnN2.ml(max * 2.0f);
            return;
        }
        detailFragmentPanel.getClass();
    }
}
