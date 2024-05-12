package X;

import Y.ARunnableS38S0100000_2;
import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6iH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167816iH extends AbstractC65781Prl implements InterfaceC88474Ynu<List<? extends Effect>, Boolean, Integer, String, List<? extends Effect>> {
    public final /* synthetic */ C167786iE LJLIL;
    public final /* synthetic */ Effect LJLILLLLZI;
    public final /* synthetic */ C150145us LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C167816iH(C167786iE c167786iE, Effect effect, C150145us c150145us) {
        super(4);
        this.LJLIL = c167786iE;
        this.LJLILLLLZI = effect;
        this.LJLJI = c150145us;
    }

    @Override // X.InterfaceC88474Ynu
    public final List<? extends Effect> invoke(List<? extends Effect> list, Boolean bool, Integer num, String str) {
        boolean z;
        List<? extends Effect> list2 = list;
        if (!bool.booleanValue()) {
            this.LJLIL.getClass();
        }
        if (list2 == null) {
            return null;
        }
        C167786iE c167786iE = this.LJLIL;
        Effect effect = this.LJLILLLLZI;
        C150145us c150145us = this.LJLJI;
        ArrayList arrayList = new ArrayList();
        InterfaceC162426Za LLJLIL = c167786iE.LLJLIL();
        if (LLJLIL != null) {
            z = LLJLIL.P9();
        } else {
            z = false;
        }
        if (C168126im.LIZ()) {
            C62A.LIZ.getClass();
            if (C62A.LIZJ() && z) {
                Effect effect2 = new Effect(null, 1, null);
                effect2.setEffectId("speech2song");
                String string = C5L7.LIZ().getString(R.string.ri0);
                o.LJIIIIZZ(string, "AppContextManager.getApp…_effectsBottomSheet_body)");
                effect2.setName(string);
                arrayList.add(effect2);
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI("content_source", H8F.LJI(c167786iE.LLJJL()));
                c145995oB.LJI("enter_from", "video_edit_page");
                c145995oB.LJI("shoot_way", c167786iE.LLJJL().mShootWay);
                c145995oB.LJI("creation_id", c167786iE.LLJJL().getCreationId());
                c145995oB.LJI("content_type", H7R.LJIIIZ(c167786iE.LLJJL()));
                c145995oB.LIZ(c167786iE.LLJJL().getPreviewInfo().getPreviewVideoLength(), "creation_duration");
                c145995oB.LJI("enter_method", "click_audio_editing");
                FMX.LJIIL("sts_entrance_show", c145995oB.LIZ);
                if (effect != null && OUP.LJJIIJ(effect)) {
                    String str2 = c167786iE.LLJJL().creativeModel.musicBuzModel.stsEffectName;
                    String str3 = c167786iE.LLJJL().creativeModel.musicBuzModel.stsTemplateId;
                    if (C78685UuP.LJJJZ(str2) && C78685UuP.LJJJZ(str3)) {
                        Effect effect3 = new Effect(null, 1, null);
                        effect3.setEffectId(str3);
                        effect3.setName(str2);
                        int LLJJIJIL = C167786iE.LLJJIJIL(effect3, c167786iE.LLJLILLLLZIIL());
                        if (LLJJIJIL >= 0) {
                            c167786iE.LLIIIILZ = effect3;
                            c167786iE.LLJLL().LIZ(LLJJIJIL, c167786iE.LLJLILLLLZIIL());
                            C168106ik LLJLL = c167786iE.LLJLL();
                            YAB yab = LLJLL.LIZIZ;
                            if (yab != null) {
                                yab.post(new ARunnableS38S0100000_2(LLJLL, 13));
                            }
                            c167786iE.LLIIIZ = true;
                        }
                    }
                }
            }
        }
        for (Effect effect4 : list2) {
            if (!CommerceToolsMusicService.LIZIZ(false).U40() || !OUP.LJJI(effect4)) {
                if (!OUP.LJJIIZ(effect4) || C166636gN.LIZIZ()) {
                    if (c150145us == null || !c150145us.LIZLLL || !OUP.LJJIIZ(effect4)) {
                        arrayList.add(effect4);
                    }
                }
            }
        }
        return arrayList;
    }
}
