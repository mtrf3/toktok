package Y;

import X.C240169bg;
import X.C240179bh;
import X.C240269bq;
import X.C27241Amb;
import X.C64797Pbt;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CheckShippingAddressData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import java.util.List;

/* loaded from: classes5.dex */
public class AfS43S0300000_4 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS43S0300000_4 afS43S0300000_4, Object obj) {
        C27241Amb Wv0 = ((AddressEditViewModel) afS43S0300000_4.l0).Wv0();
        Wv0.LIZJ = SystemClock.elapsedRealtime() - Wv0.LIZIZ;
        Response response = (Response) ((C64797Pbt) obj).LIZIZ;
        InputItemData inputItemData = (InputItemData) response.data;
        if (!response.isCodeOK() || inputItemData == null) {
            ((AddressEditViewModel) afS43S0300000_4.l0).sw0(3);
            ((AddressEditViewModel) afS43S0300000_4.l0).Wv0().LJ(0L, response.message, false);
        } else {
            ((AddressEditViewModel) afS43S0300000_4.l0).sw0(-1);
            AddressEditViewModel addressEditViewModel = (AddressEditViewModel) afS43S0300000_4.l0;
            addressEditViewModel.LJZI = inputItemData;
            AddressEditViewModel.qw0(addressEditViewModel, inputItemData, (InterfaceC65784Pro) afS43S0300000_4.l1, (Boolean) afS43S0300000_4.l2, 8);
        }
    }

    public static final void accept$1(AfS43S0300000_4 afS43S0300000_4, Object obj) {
        List<Music> musicList;
        Integer valueOf;
        List<MusicGroup> musicGroups;
        ((OriginMusicListViewModel) afS43S0300000_4.l0).LJLJJL = false;
        if (C240269bq.LIZ()) {
            PinnedMusicList pinnedMusicList = ((OriginMusicListViewModel) afS43S0300000_4.l0).LJLJI;
            if (pinnedMusicList != null && (musicGroups = pinnedMusicList.getMusicGroups()) != null) {
                valueOf = Integer.valueOf(musicGroups.indexOf((MusicGroup) afS43S0300000_4.l1));
            }
            valueOf = null;
        } else {
            PinnedMusicList pinnedMusicList2 = ((OriginMusicListViewModel) afS43S0300000_4.l0).LJLJI;
            if (pinnedMusicList2 != null && (musicList = pinnedMusicList2.getMusicList()) != null) {
                valueOf = Integer.valueOf(musicList.indexOf((Music) afS43S0300000_4.l2));
            }
            valueOf = null;
        }
        ((OriginMusicListViewModel) afS43S0300000_4.l0).listSetItems(OriginMusicListViewModel.hv0((OriginMusicListViewModel) afS43S0300000_4.l0, null, null, null, (Music) afS43S0300000_4.l2, null, null, 55));
        if (valueOf == null || valueOf.intValue() != 0) {
            ((OriginMusicListViewModel) afS43S0300000_4.l0).setState(C240179bh.LJLIL);
        } else {
            ((OriginMusicListViewModel) afS43S0300000_4.l0).setState(C240169bg.LJLIL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS43S0300000_4 afS43S0300000_4, Object obj) {
        ((AddressEditViewModel) afS43S0300000_4.l0).aw0((Address) afS43S0300000_4.l1, (CheckShippingAddressData) ((Response) ((C64797Pbt) obj).LIZIZ).data, (Integer) afS43S0300000_4.l2);
    }

    public AfS43S0300000_4(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
