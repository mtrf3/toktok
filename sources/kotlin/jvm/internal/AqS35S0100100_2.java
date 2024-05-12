package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AnonymousClass519;
import X.C52T;
import X.C54F;
import X.C5DZ;
import X.C76800UCe;
import X.C78598Ut0;
import X.C78926UyI;
import X.InterfaceC65784Pro;
import X.WM7;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.AdjustVideoIntervalFragment;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.NleClipTimeAdjustData;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.SoundAdjustFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes3.dex */
public class AqS35S0100100_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS35S0100100_2 aqS35S0100100_2) {
        EditorProScene editorProScene;
        long j = aqS35S0100100_2.j1;
        AdjustVideoIntervalFragment adjustVideoIntervalFragment = (AdjustVideoIntervalFragment) aqS35S0100100_2.l0;
        if (j >= ((NleClipTimeAdjustData) ListProtector.get(adjustVideoIntervalFragment.LLF, adjustVideoIntervalFragment.LLFII)).getEndTime() - 50) {
            AdjustVideoIntervalFragment adjustVideoIntervalFragment2 = (AdjustVideoIntervalFragment) aqS35S0100100_2.l0;
            long startTime = ((NleClipTimeAdjustData) ListProtector.get(adjustVideoIntervalFragment2.LLF, adjustVideoIntervalFragment2.LLFII)).getStartTime();
            final AdjustVideoIntervalFragment adjustVideoIntervalFragment3 = (AdjustVideoIntervalFragment) aqS35S0100100_2.l0;
            adjustVideoIntervalFragment2.om(startTime, new AnonymousClass519() { // from class: X.53Q
                @Override // X.AnonymousClass519
                public final void LIZ(int i) {
                    AdjustVideoIntervalFragment.this.mm().LJJLL(0.0f);
                    InterfaceC127784zu player = AdjustVideoIntervalFragment.this.Jl().getPlayer();
                    if (player != null) {
                        player.play();
                    }
                }
            });
            ((AdjustVideoIntervalFragment) aqS35S0100100_2.l0).mm().LJJLL(1.0f);
        } else {
            AdjustVideoIntervalFragment adjustVideoIntervalFragment4 = (AdjustVideoIntervalFragment) aqS35S0100100_2.l0;
            if (j < ((NleClipTimeAdjustData) ListProtector.get(adjustVideoIntervalFragment4.LLF, adjustVideoIntervalFragment4.LLFII)).getStartTime()) {
                ((AdjustVideoIntervalFragment) aqS35S0100100_2.l0).mm().LJJLL(0.0f);
                AdjustVideoIntervalFragment adjustVideoIntervalFragment5 = (AdjustVideoIntervalFragment) aqS35S0100100_2.l0;
                long startTime2 = ((NleClipTimeAdjustData) ListProtector.get(adjustVideoIntervalFragment5.LLF, adjustVideoIntervalFragment5.LLFII)).getStartTime();
                final AdjustVideoIntervalFragment adjustVideoIntervalFragment6 = (AdjustVideoIntervalFragment) aqS35S0100100_2.l0;
                adjustVideoIntervalFragment5.om(startTime2, new AnonymousClass519() { // from class: X.53R
                    @Override // X.AnonymousClass519
                    public final void LIZ(int i) {
                        AdjustVideoIntervalFragment.this.mm().LJJLL(0.0f);
                        InterfaceC127784zu player = AdjustVideoIntervalFragment.this.Jl().getPlayer();
                        if (player != null) {
                            player.play();
                        }
                    }
                });
            } else {
                AdjustVideoIntervalFragment adjustVideoIntervalFragment7 = (AdjustVideoIntervalFragment) aqS35S0100100_2.l0;
                float startTime3 = ((float) (j - ((NleClipTimeAdjustData) ListProtector.get(adjustVideoIntervalFragment7.LLF, adjustVideoIntervalFragment7.LLFII)).getStartTime())) * 1.0f;
                AdjustVideoIntervalFragment adjustVideoIntervalFragment8 = (AdjustVideoIntervalFragment) aqS35S0100100_2.l0;
                ((AdjustVideoIntervalFragment) aqS35S0100100_2.l0).mm().LJJLL(startTime3 / ((float) ((NleClipTimeAdjustData) ListProtector.get(adjustVideoIntervalFragment8.LLF, adjustVideoIntervalFragment8.LLFII)).getDuration()));
                int LIZ = C5DZ.LIZ((int) (j / 1000));
                AdjustVideoIntervalFragment adjustVideoIntervalFragment9 = (AdjustVideoIntervalFragment) aqS35S0100100_2.l0;
                if (LIZ != adjustVideoIntervalFragment9.LLIIIILZ) {
                    long j2 = LIZ;
                    WM7 LJI = C78598Ut0.LJI(adjustVideoIntervalFragment9.getView());
                    if ((LJI instanceof EditorProScene) && (editorProScene = (EditorProScene) LJI) != null) {
                        editorProScene.notifyTimeChange(j2);
                    }
                    ((AdjustVideoIntervalFragment) aqS35S0100100_2.l0).LLIIIILZ = LIZ;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS35S0100100_2 aqS35S0100100_2) {
        ((SoundAdjustFragment) aqS35S0100100_2.l0).LLD = aqS35S0100100_2.j1;
        long videoSelectFrameStartTime = ((C54F) ((SoundAdjustFragment) aqS35S0100100_2.l0)._$_findCachedViewById(R.id.k7c)).getVideoSelectFrameStartTime();
        final long videoSelectFrameEndTime = ((C54F) ((SoundAdjustFragment) aqS35S0100100_2.l0)._$_findCachedViewById(R.id.k7c)).getVideoSelectFrameEndTime();
        long j = videoSelectFrameEndTime - videoSelectFrameStartTime;
        long j2 = aqS35S0100100_2.j1;
        if (j2 >= videoSelectFrameEndTime - 50) {
            final SoundAdjustFragment soundAdjustFragment = (SoundAdjustFragment) aqS35S0100100_2.l0;
            SoundAdjustFragment.xm(soundAdjustFragment, videoSelectFrameEndTime, new AnonymousClass519() { // from class: X.545
                @Override // X.AnonymousClass519
                public final void LIZ(int i) {
                    if (SoundAdjustFragment.this.LLD >= videoSelectFrameEndTime - 50) {
                        SoundAdjustFragment.this.Jl().getPlayer().pause();
                        SoundAdjustFragment.this.vm(false);
                    }
                }
            }, 6);
            ((C54F) ((SoundAdjustFragment) aqS35S0100100_2.l0)._$_findCachedViewById(R.id.k7c)).LIZLLL(1.0f);
        } else if (j2 < videoSelectFrameStartTime) {
            ((C54F) ((SoundAdjustFragment) aqS35S0100100_2.l0)._$_findCachedViewById(R.id.k7c)).LIZLLL(0.0f);
            final SoundAdjustFragment soundAdjustFragment2 = (SoundAdjustFragment) aqS35S0100100_2.l0;
            SoundAdjustFragment.xm(soundAdjustFragment2, videoSelectFrameStartTime, new AnonymousClass519() { // from class: X.544
                @Override // X.AnonymousClass519
                public final void LIZ(int i) {
                    ((C54F) SoundAdjustFragment.this._$_findCachedViewById(R.id.k7c)).LIZLLL(0.0f);
                    SoundAdjustFragment.this.Jl().getPlayer().play();
                }
            }, 6);
        } else if (j != 0) {
            ((C54F) ((SoundAdjustFragment) aqS35S0100100_2.l0)._$_findCachedViewById(R.id.k7c)).LIZLLL((((float) (j2 - videoSelectFrameStartTime)) * 1.0f) / ((float) j));
            C52T om = ((SoundAdjustFragment) aqS35S0100100_2.l0).om();
            if (om != null) {
                om.LLLLLLLLL(C78926UyI.LJJIZ(aqS35S0100100_2.j1));
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS35S0100100_2(long j, AdjustVideoIntervalFragment adjustVideoIntervalFragment, int i) {
        super(0);
        this.$t = i;
        this.j1 = j;
        this.l0 = adjustVideoIntervalFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS35S0100100_2(SoundAdjustFragment soundAdjustFragment, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = soundAdjustFragment;
        this.j1 = j;
    }
}
