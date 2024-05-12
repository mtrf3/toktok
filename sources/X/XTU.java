package X;

import Y.AgS50S0201000_15;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.model.FavoriteRecommendedMusicResponse;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.music.music.collect.CollectMusicManager$initRecommendedMusicFromFavorite$1", f = "CollectMusicManager.kt", l = {183}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class XTU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ XTV LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XTU(XTV xtv, InterfaceC67352kd<? super XTU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = xtv;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new XTU(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ArrayList LJFF;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                LJFF = (ArrayList) this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            LJFF = C1JX.LJFF(obj);
            XTV xtv = this.LJLJI;
            this.LJLIL = LJFF;
            this.LJLILLLLZI = 1;
            xtv.getClass();
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            FavoriteRecommendedMusicResponse favoriteRecommendedMusicResponse = xtv.LIZLLL;
            if (favoriteRecommendedMusicResponse != null) {
                C3C5.m7constructorimpl(favoriteRecommendedMusicResponse);
                c84654XKg.resumeWith(favoriteRecommendedMusicResponse);
            } else {
                C10K LJIILJJIL = MusicService.LJJLIIIJJI().LJIILJJIL();
                if (LJIILJJIL != null) {
                    LJIILJJIL.LIZLLL(new AgS50S0201000_15(xtv, c84654XKg, 1));
                }
            }
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        FavoriteRecommendedMusicResponse favoriteRecommendedMusicResponse2 = (FavoriteRecommendedMusicResponse) obj;
        if (favoriteRecommendedMusicResponse2 != null) {
            this.LJLJI.LJII.getClass();
            List<? extends Music> list = favoriteRecommendedMusicResponse2.items;
            if (list != null) {
                LJFF.addAll(list);
            }
            if (!LJFF.isEmpty()) {
                this.LJLJI.LJII.LIZIZ.clear();
                XTW xtw = this.LJLJI.LJII;
                ArrayList arrayList = new ArrayList(C32I.LJJL(LJFF, 10));
                Iterator it = LJFF.iterator();
                while (it.hasNext()) {
                    MusicModel convertToMusicModel = ((Music) it.next()).convertToMusicModel();
                    convertToMusicModel.setMusicItemType(MusicModel.MusicItemType.RECOMMENDED_FAV_MUSIC);
                    arrayList.add(convertToMusicModel);
                }
                ArrayList<MusicModel> LIZ = C125694wX.LIZ(arrayList);
                if (LIZ == null) {
                    LIZ = new ArrayList<>();
                }
                xtw.getClass();
                xtw.LIZIZ = LIZ;
                XTV xtv2 = this.LJLJI;
                C84886XTe c84886XTe = xtv2.LIZ;
                if (c84886XTe != null) {
                    XTW xtw2 = xtv2.LJII;
                    c84886XTe.LIZJ(xtw2.LIZIZ, xtw2.LIZ);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
