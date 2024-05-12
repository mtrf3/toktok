package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.gamora.editorpro.audio.BeatInfo;
import com.ss.android.ugc.gamora.editorpro.audio.BeatTrackerData;
import com.ss.android.ugc.gamora.editorpro.audio.MergedBeatsData;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.audio.MusicBeatGenerate$getMusicBeatsFromAVMusicInfo$2", f = "MusicBeatGenerate.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5ha, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141905ha extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends BeatInfo>>, Object> {
    public final /* synthetic */ AVMusic LJLIL;
    public final /* synthetic */ C141945he LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C141905ha(AVMusic aVMusic, C141945he c141945he, InterfaceC67352kd<? super C141905ha> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = aVMusic;
        this.LJLILLLLZI = c141945he;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C141905ha(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C61878OQg c61878OQg;
        int i2;
        C141335gf.LIZJ(obj);
        StickPointMusicAlg stickPointMusicAlg = this.LJLIL.getStickPointMusicAlg();
        String downBeatsPath = stickPointMusicAlg.getDownBeatsPath();
        String noStrengthBeatsPath = stickPointMusicAlg.getNoStrengthBeatsPath();
        C61878OQg c61878OQg2 = C61878OQg.INSTANCE;
        int i3 = 0;
        if (F9B.LIZ(downBeatsPath)) {
            C141945he c141945he = this.LJLILLLLZI;
            c141945he.getClass();
            c61878OQg = c61878OQg2;
            if (downBeatsPath != null) {
                String LIZIZ = F9B.LIZIZ(downBeatsPath);
                c61878OQg = c61878OQg2;
                if (LIZIZ != null) {
                    MergedBeatsData mergedBeatsData = (MergedBeatsData) GsonProtectorUtils.fromJson((Gson) c141945he.LIZLLL.getValue(), LIZIZ, MergedBeatsData.class);
                    ArrayList arrayList = new ArrayList();
                    for (Integer num : mergedBeatsData.time) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            int intValue = num.intValue();
                            Integer num2 = (Integer) ORZ.LJLLLLLL(i3, mergedBeatsData.value);
                            if (num2 != null) {
                                i2 = num2.intValue();
                            } else {
                                i2 = -1;
                            }
                            arrayList.add(new BeatInfo(intValue, i2));
                            i3 = i4;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    boolean z = !arrayList.isEmpty();
                    c61878OQg = arrayList;
                    if (z) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("parseMergedBeatsFile: success: file path:");
                        LIZ.append(downBeatsPath);
                        H7C.LJI(3, "music", null, X1D.LIZIZ(LIZ));
                        c61878OQg = arrayList;
                    }
                }
            }
        } else {
            c61878OQg = c61878OQg2;
            if (F9B.LIZ(noStrengthBeatsPath)) {
                C141945he c141945he2 = this.LJLILLLLZI;
                c141945he2.getClass();
                c61878OQg = c61878OQg2;
                if (noStrengthBeatsPath != null) {
                    String LIZIZ2 = F9B.LIZIZ(noStrengthBeatsPath);
                    c61878OQg = c61878OQg2;
                    if (LIZIZ2 != null) {
                        BeatTrackerData beatTrackerData = (BeatTrackerData) GsonProtectorUtils.fromJson((Gson) c141945he2.LIZLLL.getValue(), LIZIZ2, BeatTrackerData.class);
                        ArrayList arrayList2 = new ArrayList();
                        for (Integer num3 : beatTrackerData.time) {
                            int i5 = i3 + 1;
                            if (i3 >= 0) {
                                int intValue2 = num3.intValue();
                                Integer num4 = (Integer) ORZ.LJLLLLLL(i3, beatTrackerData.value);
                                if (num4 != null) {
                                    i = num4.intValue();
                                } else {
                                    i = -1;
                                }
                                arrayList2.add(new BeatInfo(intValue2, i));
                                i3 = i5;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                        boolean z2 = !arrayList2.isEmpty();
                        c61878OQg = arrayList2;
                        if (z2) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("parseBeatsTrackFile: success: file path:");
                            LIZ2.append(noStrengthBeatsPath);
                            H7C.LJI(3, "music", null, X1D.LIZIZ(LIZ2));
                            c61878OQg = arrayList2;
                        }
                    }
                }
            }
        }
        return c61878OQg;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends BeatInfo>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
