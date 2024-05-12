package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.0G6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0G6 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(DataChannel dataChannel, LiveEffect liveEffect, boolean z, long j) {
        String str;
        if (liveEffect == null) {
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_take_sticker_download_time");
        LIZ2.LJIILLIIL(dataChannel);
        C77412UZs.LJJIIZ(LIZ2, liveEffect);
        LIZ2.LJIJI(true);
        LIZ2.LJIJJ(liveEffect.effectPanelKey, "tab");
        LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_finish_download");
        LIZ2.LJIJJ(Long.valueOf(j), "use_time");
        if (C29306Beo.LJIIJ(dataChannel) || C29306Beo.LJJI()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(str, "is_anchor");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZ(final LiveEffect liveEffect, final C20G adapter, final StickerEffectViewModel viewModel, final DataChannel dataChannel, final LiveEffect liveEffect2, final Long l) {
        o.LJIIIZ(liveEffect, "liveEffect");
        o.LJIIIZ(adapter, "adapter");
        o.LJIIIZ(viewModel, "viewModel");
        final C72242sW c72242sW = new C72242sW();
        viewModel.gv0(liveEffect, new C0WN() { // from class: X.1Ee
            @Override // X.C0WN
            public final void LJI(Effect effect) {
                LiveEffect liveEffect3 = LiveEffect.this;
                liveEffect3.isDownloaded = false;
                liveEffect3.isDownloading = false;
                if (adapter.LJLJJI) {
                    return;
                }
                LiveEffect liveEffect4 = liveEffect2;
                if (liveEffect4 != null) {
                    C0G6.LIZIZ(dataChannel, liveEffect4, false, System.currentTimeMillis() - c72242sW.element);
                    adapter.LJZ(liveEffect2);
                } else {
                    C0G6.LIZIZ(dataChannel, liveEffect3, false, System.currentTimeMillis() - c72242sW.element);
                    adapter.LJZ(LiveEffect.this);
                }
                BPM bpm = new BPM();
                bpm.LIZJ = R.string.m9j;
                bpm.LIZLLL = true;
                bpm.LJFF = dataChannel;
                bpm.LIZIZ = "pm_liveBackground_backgroundPanel_errorToast";
                C30868C9o.LJII(bpm);
            }

            @Override // X.C0WN
            public final void onStart(Effect effect) {
                LiveEffect liveEffect3 = LiveEffect.this;
                liveEffect3.isDownloaded = false;
                liveEffect3.isDownloading = true;
                if (adapter.LJLJJI) {
                    return;
                }
                c72242sW.element = System.currentTimeMillis();
                C40741io c40741io = adapter;
                LiveEffect liveEffect4 = liveEffect2;
                if (liveEffect4 == null) {
                    liveEffect4 = LiveEffect.this;
                }
                c40741io.LJZL(liveEffect4);
            }

            /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
            
                if (r4 != null) goto L32;
             */
            @Override // X.C0WN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onSuccess(com.ss.android.ugc.effectmanager.effect.model.Effect r9) {
                /*
                    r8 = this;
                    com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = com.bytedance.android.livesdkapi.depend.model.LiveEffect.this
                    r6 = 1
                    r0.isDownloaded = r6
                    r7 = 0
                    r0.isDownloading = r7
                    com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r4
                    boolean r0 = X.C78880UxY.LJJJJJL(r0)
                    if (r0 == 0) goto L14
                    com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r4
                    if (r0 != 0) goto L1b
                L14:
                    X.1io r0 = r2
                    boolean r0 = r0.LJLJJI
                    if (r0 == 0) goto L20
                    return
                L1b:
                    r0.isDownloaded = r6
                    r0.isDownloading = r7
                    goto L14
                L20:
                    com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r4
                    if (r0 == 0) goto L8a
                    boolean r0 = X.C78880UxY.LJJJJJL(r0)
                    if (r0 == 0) goto L49
                    com.bytedance.ies.sdk.datachannel.DataChannel r5 = r5
                    com.bytedance.android.livesdkapi.depend.model.LiveEffect r4 = r4
                    long r2 = java.lang.System.currentTimeMillis()
                    java.lang.Long r0 = r6
                    if (r0 == 0) goto L46
                    long r0 = r0.longValue()
                L3a:
                    long r2 = r2 - r0
                    X.C0G6.LIZIZ(r5, r4, r6, r2)
                    X.1io r1 = r2
                    com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r4
                    r1.LLD(r0)
                L45:
                    return
                L46:
                    r0 = 0
                    goto L3a
                L49:
                    com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r4
                    java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = r0.subStickers
                    if (r0 == 0) goto L45
                    r0.size()
                    X.1io r5 = r2
                    com.bytedance.android.livesdkapi.depend.model.LiveEffect r4 = r4
                    com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r3 = r7
                    if (r4 == 0) goto L86
                    java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = r4.subStickers
                    if (r0 == 0) goto L73
                    java.util.Iterator r2 = r0.iterator()
                    r1 = 0
                L63:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L76
                    java.lang.Object r0 = r2.next()
                    boolean r0 = r3.iv0(r0)
                    int r1 = r1 + r0
                    goto L63
                L73:
                    r1 = 0
                    if (r4 == 0) goto L86
                L76:
                    java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect> r0 = r4.subStickers
                    if (r0 == 0) goto L86
                    int r0 = r0.size()
                    float r1 = (float) r1
                    float r0 = (float) r0
                    float r1 = r1 / r0
                    r0 = 100
                    float r0 = (float) r0
                    float r1 = r1 * r0
                    int r7 = (int) r1
                L86:
                    r5.LLFF(r7, r4)
                    goto L45
                L8a:
                    com.bytedance.ies.sdk.datachannel.DataChannel r5 = r5
                    com.bytedance.android.livesdkapi.depend.model.LiveEffect r4 = com.bytedance.android.livesdkapi.depend.model.LiveEffect.this
                    long r2 = java.lang.System.currentTimeMillis()
                    X.2sW r0 = r3
                    long r0 = r0.element
                    long r2 = r2 - r0
                    X.C0G6.LIZIZ(r5, r4, r6, r2)
                    X.1io r1 = r2
                    com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = com.bytedance.android.livesdkapi.depend.model.LiveEffect.this
                    r1.LLD(r0)
                    goto L45
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C29601Ee.onSuccess(com.ss.android.ugc.effectmanager.effect.model.Effect):void");
            }

            @Override // X.C0WN
            public final void LJFF(int i, Effect effect) {
                C40741io c40741io = adapter;
                if (!c40741io.LJLJJI && liveEffect2 == null) {
                    c40741io.LLFF(i, LiveEffect.this);
                }
            }
        });
    }
}
