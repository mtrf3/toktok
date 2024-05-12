package X;

import Y.AgS50S0201000_15;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.music.music.collect.CollectMusicManager$loadMoreCollectMusic$1", f = "CollectMusicManager.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class XTT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ XTV LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XTT(XTV xtv, int i, boolean z, InterfaceC67352kd<? super XTT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = xtv;
        this.LJLJJI = i;
        this.LJLJJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new XTT(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<MusicModel> LJFF;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                LJFF = (List) this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            LJFF = C1JX.LJFF(obj);
            XTV xtv = this.LJLJI;
            int i2 = xtv.LJFF;
            int i3 = this.LJLJJI;
            this.LJLIL = LJFF;
            this.LJLILLLLZI = 1;
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            C10K LJIIJJI = MusicService.LJJLIIIJJI().LJIIJJI(i2, i3);
            if (LJIIJJI != null) {
                LJIIJJI.LIZLLL(new AgS50S0201000_15(i2, c84654XKg, xtv, 0));
            }
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        CollectedMusicList collectedMusicList = (CollectedMusicList) obj;
        if (collectedMusicList != null) {
            XTV xtv2 = this.LJLJI;
            xtv2.LJFF = collectedMusicList.cursor;
            xtv2.LJI = collectedMusicList.isHasMore();
            List<Music> list = collectedMusicList.items;
            if (list != null && list.size() > 0) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                Iterator<Music> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().convertToMusicModel());
                }
                this.LJLJI.LIZJ.addAll(arrayList);
                if (this.LJLJJL) {
                    LJFF.addAll(arrayList);
                } else {
                    LJFF = this.LJLJI.LIZJ;
                }
            }
            if (LJFF.isEmpty()) {
                C84886XTe c84886XTe = this.LJLJI.LIZ;
                if (c84886XTe != null) {
                    c84886XTe.LJ(LJFF, false);
                }
                this.LJLJI.LIZJ();
            } else {
                XTV xtv3 = this.LJLJI;
                C84886XTe c84886XTe2 = xtv3.LIZ;
                if (c84886XTe2 != null) {
                    c84886XTe2.LJ(LJFF, xtv3.LJI);
                }
                XTV xtv4 = this.LJLJI;
                if (!xtv4.LJI) {
                    xtv4.LIZJ();
                }
            }
        } else if (this.LJLJJL) {
            C84886XTe c84886XTe3 = this.LJLJI.LIZ;
            if (c84886XTe3 != null) {
                c84886XTe3.LJ(LJFF, false);
            }
        } else {
            XTV xtv5 = this.LJLJI;
            C84886XTe c84886XTe4 = xtv5.LIZ;
            if (c84886XTe4 != null) {
                c84886XTe4.LJ(xtv5.LIZJ, false);
            }
        }
        this.LJLJI.getClass();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
