package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.android.live.effect.music.BGMListFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1mM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42941mM extends FragmentStateAdapter {
    public final DataChannel LJLL;
    public final List<BGMListFragment> LJLLI;
    public final List<C33511Tf> LJLLILLLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLLILLLL).size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LJZ(int i) {
        DataChannel dataChannel = this.LJLL;
        String tabName = ((C33511Tf) ListProtector.get(this.LJLLILLLL, i)).LJLIL;
        long j = ((C33511Tf) ListProtector.get(this.LJLLILLLL, i)).LJLILLLLZI;
        o.LJIIIZ(tabName, "tabName");
        BGMListFragment bGMListFragment = new BGMListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("name", tabName);
        bundle.putLong("albumId", j);
        bGMListFragment.setArguments(bundle);
        bGMListFragment.LJLILLLLZI = dataChannel;
        if (!((ArrayList) this.LJLLI).contains(bGMListFragment)) {
            ((ArrayList) this.LJLLI).add(bGMListFragment);
        }
        return bGMListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42941mM(Fragment fragment, DataChannel dataChannel) {
        super(fragment);
        o.LJIIIZ(fragment, "fragment");
        this.LJLL = dataChannel;
        this.LJLLI = new ArrayList();
        this.LJLLILLLL = new ArrayList();
    }
}
