package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.model.message.KaraokeReqMessage;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.ReqSong;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.KaraokeMessageHelper$processRequestMessage$1", f = "KaraokeMessageHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2Fg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55362Fg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ KaraokeReqMessage LJLIL;
    public final /* synthetic */ C1Z1 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55362Fg(KaraokeReqMessage karaokeReqMessage, C1Z1 c1z1, InterfaceC67352kd<? super C55362Fg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = karaokeReqMessage;
        this.LJLILLLLZI = c1z1;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55362Fg(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List<ReqSong> list = this.LJLIL.songList;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<ReqSong> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C78926UyI.LJJJJLI(it.next(), null));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!((C279917z) next).LJII()) {
                arrayList2.add(next);
            }
        }
        KaraokeViewModel karaokeViewModel = this.LJLILLLLZI.LJLILLLLZI;
        if (karaokeViewModel != null) {
            KaraokeReqMessage karaokeReqMessage = this.LJLIL;
            karaokeViewModel.yv0(new C31171Kf(arrayList2, karaokeReqMessage.reqTimestampSeconds, karaokeReqMessage.totalReqCount));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
