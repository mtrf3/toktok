package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.toptab.panel.LiveSingleFeedFragmentPanel;
import com.ss.android.ugc.aweme.toptab.ui.LiveSingleFeedContentAssem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LhU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54952LhU implements InterfaceC54958Lha {
    public final /* synthetic */ LiveSingleFeedContentAssem LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC54958Lha
    public final boolean hasMore() {
        return ((C54668Lcu) this.LIZ.v3().getState()).LJLILLLLZI;
    }

    public C54952LhU(LiveSingleFeedContentAssem liveSingleFeedContentAssem) {
        this.LIZ = liveSingleFeedContentAssem;
    }

    @Override // X.InterfaceC54958Lha
    public final void LIZ(long j) {
        for (int size = ((ArrayList) this.LIZ.v3().LJLJI).size() - 1; -1 < size; size--) {
            Aweme aweme = (Aweme) ListProtector.get(this.LIZ.v3().LJLJI, size);
            LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
            if (newLiveRoomData != null && newLiveRoomData.id == j) {
                this.LIZ.LJJIJLIJ(aweme);
            }
        }
    }

    @Override // X.InterfaceC54958Lha
    public final void LIZIZ(java.util.Map<String, String> map) {
        LiveSingleFeedFragmentPanel liveSingleFeedFragmentPanel;
        String str = (String) ((HashMap) map).get("roomId");
        List<Aweme> list = this.LIZ.v3().LJLJI;
        LiveSingleFeedContentAssem liveSingleFeedContentAssem = this.LIZ;
        Iterator it = ((ArrayList) list).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            String str2 = null;
            if (i >= 0) {
                LiveRoomStruct newLiveRoomData = ((Aweme) next).getNewLiveRoomData();
                if (newLiveRoomData != null) {
                    str2 = Long.valueOf(newLiveRoomData.id).toString();
                }
                if (TextUtils.equals(str2, str) && (liveSingleFeedFragmentPanel = liveSingleFeedContentAssem.LJLJI) != null) {
                    liveSingleFeedFragmentPanel.setCurrentItem(i, false);
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        LiveSingleFeedFragmentPanel liveSingleFeedFragmentPanel2 = this.LIZ.LJLJI;
        if (liveSingleFeedFragmentPanel2 == null) {
            return;
        }
        liveSingleFeedFragmentPanel2.LLIL = 0L;
    }

    @Override // X.InterfaceC54958Lha
    public final void LIZJ(C50039JkR c50039JkR) {
        LiveSingleFeedContentAssem liveSingleFeedContentAssem = this.LIZ;
        liveSingleFeedContentAssem.LJLJJL = c50039JkR;
        liveSingleFeedContentAssem.LJJIJIIJI();
    }
}
