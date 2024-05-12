package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.AnonymousClass391;
import X.C16880lQ;
import X.C1FJ;
import X.C2321199b;
import X.C26338AVi;
import X.C27484AqW;
import X.C32151Nz;
import X.C57815MmZ;
import X.C57826Mmk;
import X.C57846Mn4;
import X.C78924UyG;
import X.C78939UyV;
import X.C7MY;
import X.EnumC57876MnY;
import X.EnumC62195Ob1;
import X.M90;
import X.O6R;
import X.ORZ;
import X.S3I;
import X.S3L;
import X.W5F;
import X.W5U;
import X.X1D;
import Y.ACListenerS30S0300000_4;
import Y.IDObjectS0S0101000;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS55S0400000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RectRecUserVideoCell extends RectRecUserCell<C57826Mmk> {
    public final int LJLJL = R.layout.caj;
    public C2321199b LJLJLJ;

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRecUserCell, com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.n53);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.video_cover_list)");
        this.LJLJLJ = (C2321199b) findViewById;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRecUserCell, com.ss.android.ugc.aweme.relation.usercard.impl.cell.BaseRectRecUserCell, com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final int V() {
        return this.LJLJL;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    /* renamed from: X */
    public final void onBindItemView(C57826Mmk t) {
        List<Aweme> awemeList;
        Video video;
        UrlModel cover;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        LifecycleOwner lifecycleOwner = getLifecycleOwner();
        if (lifecycleOwner == null) {
            return;
        }
        RecUser recUser = t.LJLJI;
        MatchedFriendStruct matchedFriendStruct = recUser.getMatchedFriendStruct();
        if (matchedFriendStruct != null && (awemeList = matchedFriendStruct.getAwemeList()) != null && !awemeList.isEmpty()) {
            C2321199b c2321199b = this.LJLJLJ;
            if (c2321199b != null) {
                c2321199b.setVisibility(0);
                RecUser recUser2 = t.LJLJI;
                c2321199b.setAllLoadCompleteListener(new AqS159S0100000_9(t, 952));
                C57815MmZ c57815MmZ = new C57815MmZ(t.LJLJI, awemeList, C7MY.LIZIZ(112), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), C32151Nz.LJIIZILJ(2));
                int childCount = c2321199b.getChildCount();
                List<Aweme> list = c57815MmZ.LIZIZ;
                ((LinkedHashMap) c2321199b.LJLJI).clear();
                int i = 0;
                do {
                    View childAt = c2321199b.getChildAt(i);
                    o.LJII(childAt, "null cannot be cast to non-null type com.bytedance.lighten.loader.SmartImageView");
                    SmartImageView smartImageView = (SmartImageView) childAt;
                    Aweme aweme = (Aweme) ORZ.LJLLLLLL(i, list);
                    if (aweme != null && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null) {
                        c2321199b.LJLJI.put(smartImageView, Boolean.FALSE);
                        float f = c57815MmZ.LJ;
                        W5F LJII = W5U.LJII(C78939UyV.LJ(cover));
                        LJII.LJJIIJ = smartImageView;
                        LJII.LIZIZ("user_video_cover");
                        S3I s3i = new S3I();
                        s3i.LIZLLL = f;
                        LJII.LJIJJLI = new S3L(s3i);
                        LJII.LJJIII = EnumC62195Ob1.SMALL;
                        C16880lQ.LLJJJ(LJII);
                        smartImageView.setVisibility(0);
                        C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS30S0300000_4(c2321199b, smartImageView, aweme, 0));
                    } else {
                        smartImageView.setVisibility(4);
                        C16880lQ.LJIIJ(null, smartImageView);
                    }
                    if (i != 0) {
                        C26338AVi.LJI(smartImageView, Integer.valueOf(c57815MmZ.LIZLLL), null, null, null, false, 30);
                    }
                    C27484AqW.LJI(smartImageView, Integer.valueOf(c57815MmZ.LIZJ), Integer.valueOf(c57815MmZ.LIZJ));
                    i++;
                } while (i < 3);
                if (childCount > list.size()) {
                    for (int size = list.size(); size < childCount; size++) {
                        View child = c2321199b.getChildAt(size);
                        o.LJIIIIZZ(child, "child");
                        child.setVisibility(4);
                        C16880lQ.LJIIJ(null, child);
                    }
                }
                Iterator<View> it = C78924UyG.LIZLLL(c2321199b).iterator();
                while (true) {
                    IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
                    if (iDObjectS0S0101000.hasNext()) {
                        if (((View) iDObjectS0S0101000.next()).getVisibility() == 0) {
                            C26338AVi.LJIIIZ(c2321199b, null, C1FJ.LIZIZ(4), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 21);
                            break;
                        }
                    } else {
                        C26338AVi.LJIIIZ(c2321199b, 0, 0, 0, 0, 16);
                        Iterator<View> it2 = C78924UyG.LIZLLL(c2321199b).iterator();
                        while (true) {
                            IDObjectS0S0101000 iDObjectS0S01010002 = (IDObjectS0S0101000) it2;
                            if (!iDObjectS0S01010002.hasNext()) {
                                break;
                            } else {
                                ((View) iDObjectS0S01010002.next()).setVisibility(8);
                            }
                        }
                    }
                }
                c2321199b.setOnItemClickListener(new AqS55S0400000_9(this, c2321199b, recUser2, t, 8));
                M90.LIZIZ(lifecycleOwner, recUser, EnumC57876MnY.FIND_FRIENDS).iv0(awemeList);
                return;
            }
            o.LJIJI("videoCoverList");
            throw null;
        }
        C2321199b c2321199b2 = this.LJLJLJ;
        if (c2321199b2 != null) {
            c2321199b2.setVisibility(8);
        } else {
            o.LJIJI("videoCoverList");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.RectRecUserCell, com.ss.android.ugc.aweme.relation.usercard.impl.cell.BaseRectRecUserCell, com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void o0(RecUser user, C57846Mn4 uiConfig) {
        C57846Mn4 c57846Mn4;
        int i;
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        if (uiConfig.LIZ == 102) {
            if (t0(user, uiConfig)) {
                c57846Mn4 = uiConfig;
            } else {
                c57846Mn4 = null;
            }
            if (c57846Mn4 != null) {
                i = 12;
            } else {
                i = 16;
            }
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(i));
            View findViewById = this.itemView.findViewById(R.id.kdm);
            o.LJIIIIZZ(findViewById, "itemView.start_space");
            C27484AqW.LJII(findViewById, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), null, 2);
            View findViewById2 = this.itemView.findViewById(R.id.cwn);
            o.LJIIIIZZ(findViewById2, "itemView.end_space");
            C27484AqW.LJII(findViewById2, Integer.valueOf(LJJIIZ), null, 2);
            View normal_top_area_layout = this.itemView.findViewById(R.id.h3g);
            int i2 = uiConfig.LJIIJJI;
            o.LJIIIIZZ(normal_top_area_layout, "normal_top_area_layout");
            C26338AVi.LJI(normal_top_area_layout, 0, Integer.valueOf(i2), 0, Integer.valueOf(i2), false, 16);
            View findViewById3 = this.itemView.findViewById(R.id.gj9);
            o.LJIIIIZZ(findViewById3, "itemView.middle_area_layout");
            C26338AVi.LJI(findViewById3, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), null, AnonymousClass391.LIZJ(12), null, false, 26);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("not supported current variant: ");
        LIZ.append(uiConfig.LIZ);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }
}
