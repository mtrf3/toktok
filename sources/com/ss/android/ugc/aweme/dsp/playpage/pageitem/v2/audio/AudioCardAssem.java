package com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio;

import X.AbstractC91590Zx4;
import X.C16880lQ;
import X.C214348b8;
import X.C214368bA;
import X.C2K0;
import X.C2L4;
import X.C61447O9r;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C8VR;
import X.C91188Zqa;
import X.C91304ZsS;
import X.C91334Zsw;
import X.C91395Ztv;
import X.C91545ZwL;
import X.C91605ZxJ;
import X.C9BD;
import X.EnumC91305ZsT;
import X.EnumC91310ZsY;
import X.EnumC91311ZsZ;
import X.InterfaceC115514g7;
import X.InterfaceC55102Lju;
import X.InterfaceC74236TBo;
import X.InterfaceC91289ZsD;
import X.InterfaceC91296ZsK;
import X.TBT;
import Y.IDDListenerS397S0100000_29;
import Y.IDObserverS226S0100000_29;
import Y.IDRunnableS88S0100000_29;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.dsp.IAudioCardUIStateAbility;
import com.ss.android.ugc.aweme.dsp.arch.AudioCardScope;
import com.ss.android.ugc.aweme.dsp.arch.BaseDspItemReusedAssem;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpirePlayableVM;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.lyric.LyricSlotAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.playfullsong.PlayFullSongAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.playfullsong.SongClipPreviewCTAAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.playfullsong.SongClipTipsAssem;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IViewPagerAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class AudioCardAssem extends BaseDspItemReusedAssem implements IAudioCardUIStateAbility, InterfaceC91289ZsD, InterfaceC55102Lju, C2L4 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLII;
    public C91188Zqa LLFII;
    public final MutableLiveData<Integer> LLFZ;
    public final MutableLiveData<C76800UCe> LLI;
    public final InterfaceC115514g7 LLIFFJFJJ;

    static {
        TBT tbt = new TBT(AudioCardAssem.class, "expireVM", "getExpireVM()Lcom/ss/android/ugc/aweme/dsp/playerservice/plugin/expired/ExpirePlayableVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLII = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AudioCardScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onBufferingUpdate(float f) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onCompletion() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlayableChanged(InterfaceC91296ZsK interfaceC91296ZsK) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackTimeChanged(long j) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepare() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepared() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onVideoSizeChanged(int i, int i2) {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1506908123) {
            return null;
        }
        return this;
    }

    public AudioCardAssem() {
        new LinkedHashMap();
        this.LLFZ = new MutableLiveData<>();
        this.LLI = new MutableLiveData<>();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ExpirePlayableVM.class);
        this.LLIFFJFJJ = C214348b8.LIZ(this, LIZ, c9bd, new IDqS421S0100000_29(LIZ, 25), null, C91545ZwL.INSTANCE, null, null);
    }

    @Override // X.InterfaceC91289ZsD
    public final void onRenderStart() {
        C8VR.LIZJ(this, C65352Pkq.LIZ(LyricSlotAssem.class));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        AbstractC91590Zx4 HS;
        C91605ZxJ c91605ZxJ;
        C91334Zsw c91334Zsw;
        IAudioPlayerAbility Z3 = Z3();
        if (Z3 != null && (HS = Z3.HS()) != null && (c91605ZxJ = HS.LJLILLLLZI) != null && (c91334Zsw = c91605ZxJ.LJLJI.LJLIL) != null) {
            c91334Zsw.LJIIL(this);
        }
    }

    public final void e4() {
        int height;
        IContainerUtilityAbility a4 = a4();
        if (a4 != null) {
            int z9 = a4.z9();
            IContainerUtilityAbility a42 = a4();
            if (a42 != null) {
                int v4 = a42.v4();
                C91188Zqa c91188Zqa = this.LLFII;
                if (c91188Zqa != null) {
                    c91188Zqa.setPadding(c91188Zqa.getPaddingLeft(), c91188Zqa.getPaddingTop(), c91188Zqa.getPaddingRight(), z9);
                    C91188Zqa c91188Zqa2 = this.LLFII;
                    if (c91188Zqa2 != null) {
                        Context context = c91188Zqa2.getContext();
                        o.LJIIIIZZ(context, "audioStyleView.context");
                        int LJJJJLI = C63081OpJ.LJJJJLI(context);
                        if (c4()) {
                            C91188Zqa c91188Zqa3 = this.LLFII;
                            if (c91188Zqa3 != null) {
                                height = ((c91188Zqa3.getHeight() - LJJJJLI) - v4) - z9;
                            } else {
                                o.LJIJI("audioStyleView");
                                throw null;
                            }
                        } else {
                            C91188Zqa c91188Zqa4 = this.LLFII;
                            if (c91188Zqa4 != null) {
                                height = ((c91188Zqa4.getHeight() - LJJJJLI) - v4) - BasePlayerFragment.LLFF;
                            } else {
                                o.LJIJI("audioStyleView");
                                throw null;
                            }
                        }
                        C91188Zqa c91188Zqa5 = this.LLFII;
                        if (c91188Zqa5 != null) {
                            c91188Zqa5.requestLayout();
                            C91188Zqa c91188Zqa6 = this.LLFII;
                            if (c91188Zqa6 != null) {
                                c91188Zqa6.invalidate();
                                if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
                                    this.LLFZ.setValue(Integer.valueOf(height));
                                    return;
                                } else {
                                    this.LLFZ.postValue(Integer.valueOf(height));
                                    return;
                                }
                            }
                            o.LJIJI("audioStyleView");
                            throw null;
                        }
                        o.LJIJI("audioStyleView");
                        throw null;
                    }
                    o.LJIJI("audioStyleView");
                    throw null;
                }
                o.LJIJI("audioStyleView");
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.IAudioCardUIStateAbility
    public final MutableLiveData OO() {
        return this.LLFZ;
    }

    @Override // com.ss.android.ugc.aweme.dsp.IAudioCardUIStateAbility
    public final MutableLiveData<C76800UCe> ej() {
        return this.LLI;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C91395Ztv c91395Ztv) {
        int i;
        List<C91395Ztv> list;
        List<C91395Ztv> list2;
        C91395Ztv item = c91395Ztv;
        o.LJIIIZ(item, "item");
        C91188Zqa c91188Zqa = this.LLFII;
        List<C91395Ztv> list3 = null;
        if (c91188Zqa != null) {
            if (item.LJZL) {
                i = 8;
            } else {
                i = 0;
            }
            c91188Zqa.setVisibility(i);
            Object LIZ = this.LLIFFJFJJ.LIZ(this, LLII[0]);
            IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) this.LLF.getValue();
            if (iViewPagerAbility != null) {
                list = iViewPagerAbility.getData();
            } else {
                list = null;
            }
            LIZ.getClass();
            if (list != null) {
                Iterator<C91395Ztv> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (ExpiredPlayableManager.INSTANCE.isPlayableExpiredToday(it.next().LJLJJL)) {
                        C8VR.LIZJ(this, C65352Pkq.LIZ(PlayFullSongAssem.class));
                        break;
                    }
                }
            }
            Object LIZ2 = this.LLIFFJFJJ.LIZ(this, LLII[0]);
            IViewPagerAbility iViewPagerAbility2 = (IViewPagerAbility) this.LLF.getValue();
            if (iViewPagerAbility2 != null) {
                list2 = iViewPagerAbility2.getData();
            } else {
                list2 = null;
            }
            LIZ2.getClass();
            if (list2 != null) {
                Iterator<C91395Ztv> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (it2.next().LJLJJLL) {
                        C8VR.LIZJ(this, C65352Pkq.LIZ(SongClipTipsAssem.class));
                        Object LIZ3 = this.LLIFFJFJJ.LIZ(this, LLII[0]);
                        IViewPagerAbility iViewPagerAbility3 = (IViewPagerAbility) this.LLF.getValue();
                        if (iViewPagerAbility3 != null) {
                            list3 = iViewPagerAbility3.getData();
                        }
                        LIZ3.getClass();
                        if (list3 != null) {
                            Iterator<C91395Ztv> it3 = list3.iterator();
                            while (it3.hasNext()) {
                                if (ExpiredPlayableManager.INSTANCE.isPreviewPlayableExpiredToday(it3.next().LJLJJL)) {
                                    C8VR.LIZJ(this, C65352Pkq.LIZ(SongClipPreviewCTAAssem.class));
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        o.LJIJI("audioStyleView");
        throw null;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onError(C91304ZsS errorCode) {
        o.LJIIIZ(errorCode, "errorCode");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onLoadStateChanged(EnumC91305ZsT loadingState) {
        o.LJIIIZ(loadingState, "loadingState");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackStateChanged(EnumC91310ZsY currentState) {
        o.LJIIIZ(currentState, "currentState");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C91188Zqa c91188Zqa;
        AbstractC91590Zx4 HS;
        C91605ZxJ c91605ZxJ;
        C91334Zsw c91334Zsw;
        o.LJIIIZ(view, "view");
        if (!(view instanceof C91188Zqa) || (c91188Zqa = (C91188Zqa) view) == null) {
            return;
        }
        this.LLFII = c91188Zqa;
        c91188Zqa.getViewTreeObserver().addOnPreDrawListener(new IDDListenerS397S0100000_29(this, 0));
        C91188Zqa c91188Zqa2 = this.LLFII;
        if (c91188Zqa2 != null) {
            ((ViewStub) c91188Zqa2.LIZ(R.id.nfj)).setLayoutResource(R.layout.az);
            C91188Zqa c91188Zqa3 = this.LLFII;
            if (c91188Zqa3 != null) {
                ((ViewStub) c91188Zqa3.LIZ(R.id.nfl)).setLayoutResource(R.layout.b9);
                C91188Zqa c91188Zqa4 = this.LLFII;
                if (c91188Zqa4 != null) {
                    ((ViewStub) c91188Zqa4.LIZ(R.id.nfw)).setLayoutResource(R.layout.bg);
                    C214368bA.LIZ().execute(new IDRunnableS88S0100000_29(this, 6));
                    if (c4()) {
                        C61447O9r.LJIILLIIL.observe(this, new IDObserverS226S0100000_29(this, 9));
                    }
                    IAudioPlayerAbility Z3 = Z3();
                    if (Z3 != null && (HS = Z3.HS()) != null && (c91605ZxJ = HS.LJLILLLLZI) != null && (c91334Zsw = c91605ZxJ.LJLJI.LJLIL) != null) {
                        c91334Zsw.LJII(this);
                        return;
                    }
                    return;
                }
                o.LJIJI("audioStyleView");
                throw null;
            }
            o.LJIJI("audioStyleView");
            throw null;
        }
        o.LJIJI("audioStyleView");
        throw null;
    }

    @Override // X.InterfaceC91289ZsD
    public final void onSeekStateChanged(EnumC91311ZsZ seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
    }
}
