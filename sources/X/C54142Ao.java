package X;

import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import fjb.a;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMPlaylistViewModel$downloadListener$2$1$onSucceed$1", f = "BGMPlaylistViewModel.kt", l = {61}, m = "invokeSuspend")
/* renamed from: X.2Ao, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54142Ao extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BGMPlaylistViewModel LJLILLLLZI;
    public final /* synthetic */ MusicSong LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Long, String> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C54142Ao(BGMPlaylistViewModel bGMPlaylistViewModel, MusicSong musicSong, InterfaceC88472Yns<? super Long, String> interfaceC88472Yns, InterfaceC67352kd<? super C54142Ao> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = bGMPlaylistViewModel;
        this.LJLJI = musicSong;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54142Ao(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int intValue;
        Long l;
        String str;
        String str2;
        String str3;
        Long l2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            XLL xll = this.LJLILLLLZI.LJLJI;
            final MusicSong musicSong = this.LJLJI;
            AbstractC17350mB abstractC17350mB = new AbstractC17350mB(musicSong) { // from class: X.1Vd
                {
                    o.LJIIIZ(musicSong, "musicSong");
                }
            };
            this.LJLIL = 1;
            if (xll.emit(abstractC17350mB, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        MusicSong musicSong2 = this.LJLJI;
        String invoke = this.LJLJJI.invoke(new Long(musicSong2.id));
        if (invoke == null) {
            return C76800UCe.LIZ;
        }
        MusicSong musicSong3 = null;
        if (!C14260hC.LJIIJJI) {
            MusicSong musicSong4 = C14260hC.LJ;
            if (musicSong4 != null) {
                l2 = Long.valueOf(musicSong4.id);
            } else {
                l2 = null;
            }
            if (!o.LJ(l2, Long.valueOf(musicSong2.id)) && C14260hC.LIZLLL) {
                C32101Nu.LJIIJJI(Long.valueOf(C14260hC.LJFF), Long.valueOf(System.currentTimeMillis() / 1000), 2L, null);
            }
        }
        MusicSong musicSong5 = C14260hC.LJ;
        if (musicSong5 != null && !o.LJ(Long.valueOf(musicSong5.id), Long.valueOf(musicSong2.id))) {
            if (C14260hC.LIZJ != 0) {
                MusicSong musicSong6 = C14260hC.LJ;
                int i2 = C14260hC.LIZJ;
                BZI LIZIZ = C0N3.LIZIZ("livesdk_anchor_ksong_play_duration", CardStruct.IStatusCode.DEFAULT, "is_finish");
                if (musicSong6 != null) {
                    l = Long.valueOf(musicSong6.id);
                } else {
                    l = null;
                }
                LIZIZ.LJIJJ(l, "music_id");
                if (musicSong6 != null) {
                    str = musicSong6.title;
                } else {
                    str = null;
                }
                LIZIZ.LJIJJ(str, "music_name");
                if (musicSong6 != null) {
                    str2 = musicSong6.author;
                } else {
                    str2 = null;
                }
                LIZIZ.LJIJJ(str2, "artist_name");
                if (musicSong6 != null) {
                    str3 = musicSong6.previewUrl;
                } else {
                    str3 = null;
                }
                LIZIZ.LJIJJ(str3, "music_url");
                C0JT.LIZJ(LIZIZ, C14360hM.LIZIZ, "select_scene", i2, "duration");
            }
            C14260hC.LIZJ = 0;
            C14260hC.LIZLLL = false;
        }
        C14260hC.LJ = musicSong2;
        IAudioFilterManager LIZIZ2 = C14260hC.LIZIZ();
        if (LIZIZ2 != null) {
            LIZIZ2.setEnable(true);
            LIZIZ2.setBGMMusic(invoke);
            if (C14260hC.LJIIJJI || o.LJ(DataChannelGlobal.LJLJJI.mv0(C54962Ds.class), Boolean.TRUE)) {
                LIZIZ2.pause();
                C14260hC.LJII(false);
                C15610jN.LIZIZ(new Runnable() { // from class: X.0hE
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            Iterator it = C14260hC.LIZJ().iterator();
                            while (it.hasNext()) {
                                ((InterfaceC14440hU) it.next()).LJJJLL();
                            }
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            } else {
                LIZIZ2.resume();
                C14260hC.LJII(true);
                C15610jN.LIZIZ(new Runnable() { // from class: X.0hF
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ;
                        try {
                            Iterator it = C14260hC.LIZJ().iterator();
                            while (it.hasNext()) {
                                ((InterfaceC14440hU) it.next()).h9();
                            }
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
                C14260hC.LJFF = System.currentTimeMillis() / 1000;
                C14260hC.LJI = 1L;
                C32101Nu.LJIIJJI(Long.valueOf(C14260hC.LJFF), null, null, Long.valueOf(C14260hC.LJI));
                C14260hC.LJIIIZ = false;
            }
        }
        BGMPlaylistViewModel bGMPlaylistViewModel = this.LJLILLLLZI;
        C14390hP c14390hP = (C14390hP) bGMPlaylistViewModel.LJLJLJ.getValue();
        C14320hI c14320hI = bGMPlaylistViewModel.LJLIL;
        if (c14320hI.LIZLLL(c14320hI.LJ) != null && r0.intValue() - 1 >= 0) {
            musicSong3 = (MusicSong) ListProtector.get(c14320hI.LIZIZ, intValue);
        }
        c14390hP.LIZ(musicSong3);
        if (!o.LJ(bGMPlaylistViewModel.LJLIL.LJ(), bGMPlaylistViewModel.LJLIL.LJ)) {
            ((C14390hP) bGMPlaylistViewModel.LJLJLJ.getValue()).LIZ(bGMPlaylistViewModel.LJLIL.LJ());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
