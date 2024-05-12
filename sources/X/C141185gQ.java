package X;

import Y.AfS34S0101000_2;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.gamora.editorpro.soundeffect.data.SoundEffectListApi;
import com.ss.android.ugc.gamora.editorpro.soundeffect.data.SoundEffectListApiResponse;
import com.ss.android.ugc.gamora.editorpro.soundeffect.model.SoundEffectTabModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.5gQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141185gQ {
    public final InterfaceC141035gB LIZ;
    public final SoundEffectTabModel LIZIZ;
    public final View LIZJ;
    public final int LIZLLL;
    public C141455gr LJ;
    public final ArrayList<C141225gU> LJFF;
    public C73318Sq2 LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public View LJIIJ;
    public View LJIIJJI;
    public TextView LJIIL;
    public RecyclerView LJIILIIL;
    public C73305Spp LJIILJJIL;
    public final C62822Ol8 LJIILL;

    public final void LIZIZ() {
        View view = this.LJIIJ;
        if (view != null) {
            view.setVisibility(8);
        }
        C73305Spp c73305Spp = this.LJIILJJIL;
        if (c73305Spp == null) {
            return;
        }
        c73305Spp.setVisibility(8);
    }

    public final void LIZ(final int i) {
        final boolean z;
        C73390SrC LJIIJ;
        if (this.LJ == null || i == 0) {
            LIZIZ();
            C73305Spp c73305Spp = this.LJIILJJIL;
            if (c73305Spp != null) {
                c73305Spp.setVisibility(0);
            }
            C73305Spp c73305Spp2 = this.LJIILJJIL;
            if (c73305Spp2 != null) {
                c73305Spp2.LJFF();
            }
        }
        final boolean LIZ = CommerceMediaServiceImpl.LIZJ().LIZ();
        final String str = this.LIZIZ.id;
        o.LJI(str);
        if (this.LIZIZ.LIZ == 1) {
            z = true;
        } else {
            z = false;
        }
        final C141205gS soundEffectDataManager = (C141205gS) this.LJIILL.getValue();
        o.LJIIIZ(soundEffectDataManager, "soundEffectDataManager");
        if (i == 0 && !z && soundEffectDataManager.LIZIZ.containsKey(str)) {
            LJIIJ = AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.5gR
                @Override // X.InterfaceC86003Zc
                public final void subscribe(InterfaceC73573Su9<SoundEffectListApiResponse> interfaceC73573Su9) {
                    C141205gS c141205gS = C141205gS.this;
                    String pageId = str;
                    c141205gS.getClass();
                    o.LJIIIZ(pageId, "pageId");
                    SoundEffectListApiResponse soundEffectListApiResponse = c141205gS.LIZIZ.get(pageId);
                    if (soundEffectListApiResponse != null) {
                        interfaceC73573Su9.onNext(soundEffectListApiResponse);
                    } else {
                        interfaceC73573Su9.tryOnError(new Exception("cache error"));
                    }
                }
            });
        } else {
            LJIIJ = AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.5gT
                public final /* synthetic */ int LJLJJI = 20;

                @Override // X.InterfaceC86003Zc
                public final void subscribe(InterfaceC73573Su9<SoundEffectListApiResponse> interfaceC73573Su9) {
                    int i2;
                    boolean z2;
                    ArrayList<SoundEffect> arrayList;
                    int i3;
                    boolean z3;
                    try {
                        if (!z) {
                            SoundEffectListApi.ApiSoundList apiSoundList = (SoundEffectListApi.ApiSoundList) C60903NvH.LJIIJJI().getNetworkService().createRetrofit(C60903NvH.LJIIJJI().getNetworkService().getApiHost(), true, SoundEffectListApi.ApiSoundList.class);
                            String str2 = str;
                            String valueOf = String.valueOf(i);
                            String valueOf2 = String.valueOf(this.LJLJJI);
                            C48153Iv7 c48153Iv7 = new C48153Iv7();
                            c48153Iv7.LIZLLL = 30000L;
                            c48153Iv7.LIZJ = 30000L;
                            c48153Iv7.LJ = 30000L;
                            SoundEffectListApiResponse soundEffectListApiResponse = apiSoundList.get(str2, valueOf, valueOf2, c48153Iv7).execute().LIZIZ;
                            ArrayList<SoundEffect> arrayList2 = soundEffectListApiResponse.list;
                            if (arrayList2 == null || arrayList2.isEmpty()) {
                                interfaceC73573Su9.tryOnError(new IllegalStateException("result list is null"));
                                C141355gh.LIZIZ(soundEffectListApiResponse.status_code, str, false);
                                return;
                            }
                            int i4 = i;
                            ArrayList<SoundEffect> arrayList3 = soundEffectListApiResponse.list;
                            o.LJI(arrayList3);
                            soundEffectListApiResponse.LJLIL = Integer.valueOf(i4 + arrayList3.size());
                            C141205gS c141205gS = soundEffectDataManager;
                            String str3 = str;
                            ArrayList<SoundEffect> arrayList4 = soundEffectListApiResponse.list;
                            o.LJI(arrayList4);
                            Integer num = soundEffectListApiResponse.LJLIL;
                            o.LJI(num);
                            int intValue = num.intValue();
                            Integer num2 = soundEffectListApiResponse.hasMore;
                            if (num2 != null) {
                                i3 = num2.intValue();
                            } else {
                                i3 = 0;
                            }
                            c141205gS.LIZ(intValue, i3, str3, arrayList4);
                            C141355gh.LIZIZ(0, str, true);
                            ArrayList<SoundEffect> arrayList5 = soundEffectListApiResponse.list;
                            if (arrayList5 != null) {
                                C141205gS c141205gS2 = soundEffectDataManager;
                                Iterator<SoundEffect> it = arrayList5.iterator();
                                while (it.hasNext()) {
                                    SoundEffect next = it.next();
                                    String id = V1B.LJJLIIIJLLLLLLLZ(next);
                                    if (next.collectStatus == 1) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    c141205gS2.getClass();
                                    o.LJIIIZ(id, "id");
                                    c141205gS2.LIZJ.put(id, Boolean.valueOf(z3));
                                }
                            }
                            interfaceC73573Su9.onNext(soundEffectListApiResponse);
                            return;
                        }
                        SoundEffectListApi.ApiCollectList apiCollectList = (SoundEffectListApi.ApiCollectList) C60903NvH.LJIIJJI().getNetworkService().createRetrofit(C60903NvH.LJIIJJI().getNetworkService().getApiHost(), true, SoundEffectListApi.ApiCollectList.class);
                        if (LIZ) {
                            i2 = 14;
                        } else {
                            i2 = 13;
                        }
                        String valueOf3 = String.valueOf(i);
                        String valueOf4 = String.valueOf(this.LJLJJI);
                        C48153Iv7 c48153Iv72 = new C48153Iv7();
                        c48153Iv72.LIZLLL = 30000L;
                        c48153Iv72.LIZJ = 30000L;
                        c48153Iv72.LJ = 30000L;
                        SoundEffectListApiResponse soundEffectListApiResponse2 = apiCollectList.get(i2, valueOf3, valueOf4, c48153Iv72).execute().LIZIZ;
                        if (soundEffectListApiResponse2.status_code == 0 && ((arrayList = soundEffectListApiResponse2.list) == null || arrayList.isEmpty())) {
                            interfaceC73573Su9.tryOnError(new IllegalStateException("error_msg_empty"));
                            C141355gh.LIZIZ(0, str, true);
                        }
                        ArrayList<SoundEffect> arrayList6 = soundEffectListApiResponse2.list;
                        if (arrayList6 == null || arrayList6.isEmpty()) {
                            interfaceC73573Su9.tryOnError(new IllegalStateException("result list is null"));
                            C141355gh.LIZIZ(soundEffectListApiResponse2.status_code, str, true);
                            return;
                        }
                        int i5 = i;
                        ArrayList<SoundEffect> arrayList7 = soundEffectListApiResponse2.list;
                        o.LJI(arrayList7);
                        soundEffectListApiResponse2.LJLIL = Integer.valueOf(i5 + arrayList7.size());
                        C141355gh.LIZIZ(0, str, true);
                        ArrayList<SoundEffect> arrayList8 = soundEffectListApiResponse2.list;
                        if (arrayList8 != null) {
                            C141205gS c141205gS3 = soundEffectDataManager;
                            Iterator<SoundEffect> it2 = arrayList8.iterator();
                            while (it2.hasNext()) {
                                SoundEffect next2 = it2.next();
                                String id2 = V1B.LJJLIIIJLLLLLLLZ(next2);
                                if (next2.collectStatus == 1) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                c141205gS3.getClass();
                                o.LJIIIZ(id2, "id");
                                c141205gS3.LIZJ.put(id2, Boolean.valueOf(z2));
                            }
                        }
                        interfaceC73573Su9.onNext(soundEffectListApiResponse2);
                    } catch (Exception e) {
                        C141355gh.LIZIZ(-9999, str, false);
                        interfaceC73573Su9.tryOnError(e);
                    }
                }
            });
        }
        this.LJI.LIZ(LJIIJ.LJJIJL(C73975T1n.LJLIL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS34S0101000_2(this, i, 0), new AfS34S0101000_2(this, i, 1)));
    }

    public C141185gQ(ActivityC45651qj activity, InterfaceC141035gB soundEffectItemEventListener, SoundEffectTabModel soundEffectTabModel, View view, int i) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(soundEffectItemEventListener, "soundEffectItemEventListener");
        this.LIZ = soundEffectItemEventListener;
        this.LIZIZ = soundEffectTabModel;
        this.LIZJ = view;
        this.LIZLLL = i;
        this.LJFF = new ArrayList<>();
        this.LJI = new C73318Sq2();
        this.LJIIIIZZ = true;
        this.LJIILL = C221108m2.LIZIZ(C134995Rn.LJLIL);
    }
}
