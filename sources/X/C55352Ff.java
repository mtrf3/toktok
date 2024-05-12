package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.model.KaraokeSong;
import com.bytedance.android.livesdk.model.message.KaraokeQueueMessage;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.KaraokeMessageHelper$processQueueMessage$1", f = "KaraokeMessageHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2Ff, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55352Ff extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ KaraokeQueueMessage LJLIL;
    public final /* synthetic */ C1Z1 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55352Ff(KaraokeQueueMessage karaokeQueueMessage, C1Z1 c1z1, InterfaceC67352kd<? super C55352Ff> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = karaokeQueueMessage;
        this.LJLILLLLZI = c1z1;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55352Ff(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        KaraokeViewModel karaokeViewModel;
        KaraokeViewModel karaokeViewModel2;
        C141335gf.LIZJ(obj);
        KaraokeQueueMessage karaokeQueueMessage = this.LJLIL;
        int i = karaokeQueueMessage.type;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (karaokeViewModel2 = this.LJLILLLLZI.LJLILLLLZI) != null) {
                            karaokeViewModel2.yv0(new C41831kZ());
                        }
                    } else {
                        KaraokeSong karaokeSong = karaokeQueueMessage.song;
                        if (karaokeSong != null) {
                            long j = karaokeSong.id;
                            KaraokeViewModel karaokeViewModel3 = this.LJLILLLLZI.LJLILLLLZI;
                            if (karaokeViewModel3 != null) {
                                karaokeViewModel3.yv0(new C41861kc(j));
                            }
                        }
                    }
                } else {
                    KaraokeSong karaokeSong2 = karaokeQueueMessage.song;
                    if (karaokeSong2 != null) {
                        long j2 = karaokeSong2.id;
                        KaraokeViewModel karaokeViewModel4 = this.LJLILLLLZI.LJLILLLLZI;
                        if (karaokeViewModel4 != null) {
                            karaokeViewModel4.yv0(new C41961km(j2));
                        }
                    }
                }
            } else {
                C279917z LJJJJL = C78926UyI.LJJJJL(karaokeQueueMessage.song, null);
                if (!LJJJJL.LJII() && (karaokeViewModel = this.LJLILLLLZI.LJLILLLLZI) != null) {
                    karaokeViewModel.yv0(new C41771kT(LJJJJL));
                }
            }
        } else {
            KaraokeViewModel karaokeViewModel5 = this.LJLILLLLZI.LJLILLLLZI;
            if (karaokeViewModel5 != null) {
                karaokeViewModel5.yv0(new C41781kU(C78926UyI.LJJJJL(karaokeQueueMessage.song, null)));
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
