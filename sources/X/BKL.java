package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.HashSet;

/* loaded from: classes6.dex */
public class BKL extends BKM {
    public final InterfaceC28220B5s LJLJJL;
    public final BKN LJLJJLL;
    public final C1HQ LJLJL;
    public LiveRoomFragment LJLJLJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJL.size();
    }

    public static String LJJIIJ(EnterRoomConfig enterRoomConfig) {
        if (!TextUtils.isEmpty(enterRoomConfig.mRoomsData.fragmentItemVPId)) {
            return enterRoomConfig.mRoomsData.fragmentItemVPId;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(enterRoomConfig.mRoomsData.roomId);
        LIZ.append("_");
        LIZ.append(enterRoomConfig.mLogData.requestId);
        String LIZIZ = X1D.LIZIZ(LIZ);
        enterRoomConfig.mRoomsData.fragmentItemVPId = LIZIZ;
        return LIZIZ;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object obj) {
        EnterRoomConfig Jj;
        int LJ;
        if (!(obj instanceof BKJ) || (Jj = ((BKJ) obj).Jj()) == null || (LJ = this.LJLJJL.LJ(Jj)) < 0) {
            return -2;
        }
        return LJ;
    }

    public final BKJ LJJIII(int i) {
        return (BKJ) this.LJLJL.getOrDefault(LJJIIJ(this.LJLJJL.LIZLLL(i)), null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.BKN, java.lang.Object] */
    public BKL(FragmentManager fragmentManager, AbstractC28221B5t abstractC28221B5t) {
        super(fragmentManager);
        ?? r1 = new InterfaceC28209B5h() { // from class: X.BKN
            @Override // X.InterfaceC28209B5h
            public final void LIZ() {
                BKL.this.notifyDataSetChanged();
            }
        };
        this.LJLJJLL = r1;
        this.LJLJL = new C1HQ();
        this.LJLJJL = abstractC28221B5t;
        ((HashSet) abstractC28221B5t.LJLIL).add(r1);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup viewGroup, Object obj) {
        if (obj instanceof BKJ) {
            BKJ bkj = (BKJ) obj;
            bkj.LLLFF();
            this.LJLJJL.LJII(bkj.B2());
            this.LJLJL.remove(LJJIIJ(bkj.Jj()));
        }
        if (this.LJLJI == null) {
            FragmentManager fragmentManager = this.LJLILLLLZI;
            this.LJLJI = C1B6.LIZ(fragmentManager, fragmentManager);
        }
        this.LJLJI.LJJI((Fragment) obj);
    }
}
