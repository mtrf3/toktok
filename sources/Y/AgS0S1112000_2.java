package Y;

import X.C10I;
import X.C10K;
import X.C146855pZ;
import X.C165706es;
import X.C26045AKb;
import X.C32151Nz;
import X.C44384HbQ;
import X.C5MM;
import X.C5RT;
import X.C78866UxK;
import X.HOH;
import X.InterfaceC142515iZ;
import X.InterfaceC145415nF;
import X.InterfaceC146845pY;
import X.InterfaceC147905rG;
import X.InterfaceC153045zY;
import X.OSZ;
import X.ProgressDialogC164766dM;
import android.app.Activity;
import android.util.Pair;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.zhiliaoapp.musically.R;
import dmt.av.video.ReplayLiveData;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AgS0S1112000_2 implements C10I {
    public final int $t;
    public int i3;
    public int i4;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r2.LLJJIII().LLZZ() == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$0(Y.AgS0S1112000_2 r14, X.C10K r15) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS0S1112000_2.then$0(Y.AgS0S1112000_2, X.10K):java.lang.Object");
    }

    public static final Object then$1(AgS0S1112000_2 agS0S1112000_2, C10K c10k) {
        boolean z;
        boolean z2;
        AVMusicWaveBean aVMusicWaveBean;
        C146855pZ c146855pZ = (C146855pZ) agS0S1112000_2.l1;
        ProgressDialogC164766dM progressDialogC164766dM = c146855pZ.LLFF;
        if (progressDialogC164766dM != null) {
            progressDialogC164766dM.dismiss();
        }
        c146855pZ.LLFF = null;
        if (c10k != null) {
            Pair pair = (Pair) c10k.LJIIJJI();
            if (c10k.LJIILJJIL() || c10k.LJIIL()) {
                z = true;
            } else {
                z = false;
            }
            if (pair != null && pair.first != null) {
                Object obj = pair.first;
                o.LJIIIIZZ(obj, "pair.first");
                if (((Number) obj).intValue() >= 0) {
                    z2 = false;
                    if (!z || z2) {
                        Activity requireActivity = ((C146855pZ) agS0S1112000_2.l1).requireActivity();
                        o.LJIIIIZZ(requireActivity, "requireActivity()");
                        C26045AKb c26045AKb = new C26045AKb(requireActivity);
                        c26045AKb.LJIIIZ(((C146855pZ) agS0S1112000_2.l1).getString(R.string.ijs));
                        c26045AKb.LJIIJ();
                    } else {
                        C146855pZ c146855pZ2 = (C146855pZ) agS0S1112000_2.l1;
                        if (c146855pZ2.LLLF().getTimeEffect() != null || !C32151Nz.LJJIIJZLJL(c146855pZ2.LLLF().getEffectList()) || c146855pZ2.LLLF().hasInfoStickers() || c146855pZ2.LLJJIII().LLZZ()) {
                            InterfaceC146845pY interfaceC146845pY = c146855pZ2.LLJJIII().LJLLL;
                            if (interfaceC146845pY != null) {
                                interfaceC146845pY.LLILZ();
                            }
                            c146855pZ2.LLJJIII().LLJILJIL().y2();
                            ArrayList<EffectPointModel> J7 = c146855pZ2.LLJZIJLIL().J7();
                            ReplayLiveData<C5RT> pJ = c146855pZ2.LLJZIJLIL().pJ();
                            if (!C32151Nz.LJJIIJZLJL(J7)) {
                                int size = J7.size();
                                int[] iArr = new int[size];
                                String[] strArr = new String[J7.size()];
                                for (int i = 0; i < size; i++) {
                                    iArr[i] = ((EffectPointModel) ListProtector.get(J7, i)).getIndex();
                                    strArr[i] = ((EffectPointModel) ListProtector.get(J7, i)).getUuid();
                                }
                                C5RT c5rt = new C5RT();
                                c5rt.LJI = 3;
                                c5rt.LIZ = iArr;
                                c5rt.LIZIZ = strArr;
                                pJ.setValue(c5rt);
                            }
                            if (!C32151Nz.LJJIIJZLJL(c146855pZ2.LLLF().getEffectList())) {
                                c146855pZ2.LLLF().getEffectList().clear();
                            }
                            Activity requireActivity2 = ((C146855pZ) agS0S1112000_2.l1).requireActivity();
                            o.LJIIIIZZ(requireActivity2, "requireActivity()");
                            C26045AKb c26045AKb2 = new C26045AKb(requireActivity2);
                            c26045AKb2.LJIIIZ(((C146855pZ) agS0S1112000_2.l1).getString(R.string.ijt));
                            c26045AKb2.LJIIJ();
                        }
                        if (pair != null) {
                            aVMusicWaveBean = (AVMusicWaveBean) pair.second;
                        } else {
                            aVMusicWaveBean = null;
                        }
                        InterfaceC153045zY LLL = ((C146855pZ) agS0S1112000_2.l1).LLL();
                        if (LLL != null) {
                            int duration = LLL.getDuration();
                            AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(((C146855pZ) agS0S1112000_2.l1).LLLF().creativeModel.musicBuzModel);
                            if (extractAVMusic != null && extractAVMusic.getShootDuration() > 0) {
                                int LIZ = HOH.LIZ(((C146855pZ) agS0S1112000_2.l1).LLLF().getCurMusicServerLength(), agS0S1112000_2.s0);
                                if (Math.abs(LIZ - extractAVMusic.getShootDuration()) >= 1000) {
                                    InterfaceC145415nF interfaceC145415nF = ((C146855pZ) agS0S1112000_2.l1).LJZI;
                                    if (interfaceC145415nF != null) {
                                        interfaceC145415nF.LJJLIIIJ(Math.min(duration, extractAVMusic.getShootDuration()));
                                    } else {
                                        o.LJIJI("editCutMusicApi");
                                        throw null;
                                    }
                                } else {
                                    InterfaceC145415nF interfaceC145415nF2 = ((C146855pZ) agS0S1112000_2.l1).LJZI;
                                    if (interfaceC145415nF2 != null) {
                                        interfaceC145415nF2.LJJLIIIJ(Math.min(duration, LIZ));
                                    } else {
                                        o.LJIJI("editCutMusicApi");
                                        throw null;
                                    }
                                }
                            } else {
                                InterfaceC145415nF interfaceC145415nF3 = ((C146855pZ) agS0S1112000_2.l1).LJZI;
                                if (interfaceC145415nF3 != null) {
                                    interfaceC145415nF3.LJJLIIIJ(duration);
                                } else {
                                    o.LJIJI("editCutMusicApi");
                                    throw null;
                                }
                            }
                            if (agS0S1112000_2.z2) {
                                InterfaceC145415nF interfaceC145415nF4 = ((C146855pZ) agS0S1112000_2.l1).LJZI;
                                if (interfaceC145415nF4 != null) {
                                    interfaceC145415nF4.ds0(aVMusicWaveBean, agS0S1112000_2.i3, 0);
                                } else {
                                    o.LJIJI("editCutMusicApi");
                                    throw null;
                                }
                            }
                            ((EditEffectVideoModel) C165706es.LJIIIIZZ((C146855pZ) agS0S1112000_2.l1, null, null, 6).get(EditEffectVideoModel.class)).pv0().setValue(Integer.valueOf(duration));
                            int LLIZLLLIL = LLL.LLIZLLLIL();
                            C146855pZ c146855pZ3 = (C146855pZ) agS0S1112000_2.l1;
                            InterfaceC147905rG LIZ2 = ((InterfaceC142515iZ) c146855pZ3.LJLJJL.LIZ(c146855pZ3, C146855pZ.LLFZ[0])).oi0().LIZ();
                            if (LIZ2 != null) {
                                LIZ2.LLLLIIIILLL(new OSZ<>(Integer.valueOf(LLIZLLLIL), Integer.valueOf(duration)));
                            }
                            if (((C146855pZ) agS0S1112000_2.l1).getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
                                MutableLiveData<C5MM> DM = ((C146855pZ) agS0S1112000_2.l1).LLJZIJLIL().DM();
                                DM.setValue(C5MM.LIZLLL(agS0S1112000_2.i4));
                                DM.setValue(C5MM.LIZ());
                            }
                            if (!C78866UxK.LJJJZ(((C146855pZ) agS0S1112000_2.l1).LLLF())) {
                                ((C146855pZ) agS0S1112000_2.l1).LLJJ().B8(C44384HbQ.LJIIL(((C146855pZ) agS0S1112000_2.l1).LLLF().getCurMusicServerLength(), ((C146855pZ) agS0S1112000_2.l1).LLLF(), agS0S1112000_2.s0));
                            }
                        }
                    }
                }
            }
            z2 = true;
            if (!z) {
            }
            Activity requireActivity3 = ((C146855pZ) agS0S1112000_2.l1).requireActivity();
            o.LJIIIIZZ(requireActivity3, "requireActivity()");
            C26045AKb c26045AKb3 = new C26045AKb(requireActivity3);
            c26045AKb3.LJIIIZ(((C146855pZ) agS0S1112000_2.l1).getString(R.string.ijs));
            c26045AKb3.LJIIJ();
        }
        return null;
    }

    public AgS0S1112000_2(int i, int i2, Object obj, String str, boolean z, int i3) {
        this.$t = i3;
        this.l1 = obj;
        this.s0 = str;
        this.z2 = z;
        this.i3 = i;
        this.i4 = i2;
    }
}
