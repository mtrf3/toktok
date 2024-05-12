package com.ss.android.ugc.tiktok.addyours.ui.assem;

import X.ASQ;
import X.ASU;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C17N;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C219248j2;
import X.C219398jH;
import X.C219408jI;
import X.C220228kc;
import X.C220258kf;
import X.C220268kg;
import X.C220318kl;
import X.C221118m3;
import X.C223338pd;
import X.C26306AUc;
import X.C43694HCw;
import X.C47704Ins;
import X.C51031K1b;
import X.C55480Lq0;
import X.C55749LuL;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C78926UyI;
import X.C8YN;
import X.C9BD;
import X.QD3;
import X.TBT;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerRecordServiceImpl;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class AddYoursDetailScaffoldAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final C5H3 LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public AddYoursDetailScaffoldAssem() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(AddYoursDetailViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 1432), C220258kf.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, C220228kc.class, "AddYoursDetailPageHierarchyData"), checkSupervisorPrepared());
        this.LJLJI = C221118m3.LIZ(new AqS153S0100000_3(this, 1433));
    }

    public final AddYoursDetailViewModel A3() {
        return (AddYoursDetailViewModel) this.LJLIL.getValue();
    }

    public final C220228kc x3() {
        return (C220228kc) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    public final void C3(boolean z) {
        Aweme aweme;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        if (!z) {
            aweme = x3().LJLJJI;
            if (aweme == null) {
                AddYoursTopic addYoursTopic = A3().getState().LJLIL;
                if (addYoursTopic != null) {
                    aweme = addYoursTopic.getVideo();
                }
            }
            AddYoursStickerRecordServiceImpl.LIZIZ().LIZ(LIZ, aweme, v3(z)).LIZLLL();
        }
        aweme = null;
        AddYoursStickerRecordServiceImpl.LIZIZ().LIZ(LIZ, aweme, v3(z)).LIZLLL();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onLoadEvent(C220318kl event) {
        Long l;
        String str;
        Resources resources;
        String string;
        Resources resources2;
        o.LJIIIZ(event, "event");
        boolean z = event.LJLIL;
        C51031K1b<?> c51031K1b = event.LJLILLLLZI;
        Long l2 = event.LJLJI;
        AddYoursTopic addYoursTopic = A3().getState().LJLIL;
        if (addYoursTopic != null) {
            l = addYoursTopic.getTopicId();
        } else {
            l = null;
        }
        if (!o.LJ(l2, l)) {
            return;
        }
        ((C223338pd) _$_findCachedViewById(R.id.g8n)).LIZJ();
        if (z) {
            C17N.LJJIIJZLJL(_$_findCachedViewById(R.id.heu));
            return;
        }
        C55480Lq0.LIZIZ.LIZ(249372161, false);
        C17N.LJJIIJZLJL(_$_findCachedViewById(R.id.g8n));
        C17N.LJJLIIIJJI(_$_findCachedViewById(R.id.cyp));
        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.cyp);
        C73306Spq c73306Spq = new C73306Spq();
        Context context = getContext();
        String str2 = "";
        if (context == null || (resources2 = context.getResources()) == null || (str = resources2.getString(R.string.dte)) == null) {
            str = "";
        }
        Context context2 = getContext();
        if (context2 != null && (resources = context2.getResources()) != null && (string = resources.getString(R.string.g5t)) != null) {
            str2 = string;
        }
        C73312Spw.LJIIIIZZ(c73306Spq, str, str2, 0, new AqS150S0200000_3(this, (AddYoursDetailScaffoldAssem) c51031K1b, (C51031K1b<?>) 53), 28);
        c73305Spp.setStatus(c73306Spq);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPublishStatus(C43694HCw publishStatus) {
        Fragment LIZLLL;
        o.LJIIIZ(publishStatus, "publishStatus");
        if (publishStatus.LJLIL == 2 && (LIZLLL = C212428Vi.LIZLLL(this)) != null) {
            ASQ.LJ(LIZLLL, new ASU() { // from class: X.8kk
            });
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onTopicUpdated(C219248j2 event) {
        Long l;
        o.LJIIIZ(event, "event");
        Long topicId = event.LJLIL.getTopicId();
        AddYoursTopic addYoursTopic = A3().getState().LJLIL;
        if (addYoursTopic != null) {
            l = addYoursTopic.getTopicId();
        } else {
            l = null;
        }
        if (o.LJ(topicId, l)) {
            AddYoursDetailViewModel A3 = A3();
            AddYoursTopic topic = event.LJLIL;
            A3.getClass();
            o.LJIIIZ(topic, "topic");
            A3.withState(new AqS134S0200000_3(A3, topic, 10));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View close_button = _$_findCachedViewById(R.id.bfj);
        o.LJIIIIZZ(close_button, "close_button");
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 27, 42, 42), close_button);
        View btn_new_prompt = _$_findCachedViewById(R.id.axe);
        o.LJIIIIZZ(btn_new_prompt, "btn_new_prompt");
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 39, 42, 42), btn_new_prompt);
        View btn_post_new = _$_findCachedViewById(R.id.ay0);
        o.LJIIIIZZ(btn_post_new, "btn_post_new");
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 40, 42, 42), btn_post_new);
        Context context = getContext();
        if (context != null) {
            TextView textView = (TextView) _$_findCachedViewById(R.id.ms7);
            if (((Number) C26306AUc.LIZ.getValue()).intValue() == 1) {
                i = R.string.bd4;
            } else {
                i = R.string.bcp;
            }
            CharSequence text = context.getResources().getText(i);
            o.LJIIIIZZ(text, "context.resources.getText(id)");
            textView.setText(text);
        }
        C8YN.LJII(this, A3(), new TBT() { // from class: X.8ki
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C219458jN) obj).LJLIL;
            }
        }, null, C219398jH.LJLIL, 6);
        View collect_button = _$_findCachedViewById(R.id.bgy);
        o.LJIIIIZZ(collect_button, "collect_button");
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 41, 42, 42), collect_button);
        C8YN.LJIIJ(this, A3(), new TBT() { // from class: X.8kj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C219458jN) obj).LJLIL;
            }
        }, new TBT() { // from class: X.8jO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((C219458jN) obj).LJLILLLLZI);
            }
        }, null, C219408jI.LJLIL, 12);
        ((C223338pd) _$_findCachedViewById(R.id.g8n)).LIZIZ();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            Aweme aweme = x3().LJLJJI;
            if (aweme == null) {
                AddYoursTopic addYoursTopic = A3().getState().LJLIL;
                if (addYoursTopic != null) {
                    aweme = addYoursTopic.getVideo();
                } else {
                    aweme = null;
                }
            }
            AddYoursStickerRecordServiceImpl.LIZIZ().LIZ(LIZ, aweme, v3(false)).LIZJ();
        }
        C8YN.LJII(this, A3(), new TBT() { // from class: X.8kh
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C219458jN) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), C220268kg.LJLIL, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam v3(boolean r32) {
        /*
            r31 = this;
            r10 = 0
            r2 = r32
            if (r2 == 0) goto L42
        L5:
            r1 = r10
            if (r2 == 0) goto L9d
            java.lang.String r6 = "detail_page_new_prompt"
        La:
            X.8kc r0 = r31.x3()
            java.lang.Integer r0 = r0.LJLILLLLZI
            if (r0 == 0) goto L40
            java.lang.String r7 = r0.toString()
        L16:
            r8 = r2 ^ 1
            if (r2 == 0) goto L33
        L1a:
            X.8kc r0 = r31.x3()
            boolean r9 = r0.LJLJJL
            boolean r3 = X.C226388uY.LJ()
            com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam r0 = new com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam
            java.lang.String r4 = "add_yours_detail_page"
            java.lang.String r5 = "add_yours"
            r11 = 0
            r13 = 3072(0xc00, float:4.305E-42)
            r12 = r11
            r14 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L33:
            X.8kc r0 = r31.x3()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJLJJI
            if (r0 == 0) goto L1a
            java.lang.String r10 = r0.getGroupId()
            goto L1a
        L40:
            r7 = r10
            goto L16
        L42:
            com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursDetailViewModel r0 = r31.A3()
            X.33Q r0 = r0.getState()
            X.8jN r0 = (X.C219458jN) r0
            com.ss.android.ugc.aweme.addyours.model.AddYoursTopic r0 = r0.LJLIL
            if (r0 == 0) goto L5
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r5 = new com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct
            java.lang.Long r6 = r0.getTopicId()
            java.lang.String r8 = r0.getText()
            r22 = 0
            java.lang.Long r11 = r0.getVideoCount()
            java.lang.Boolean r12 = r0.getFromQuestion()
            java.lang.Boolean r14 = r0.getViewerInvited()
            r15 = 0
            r17 = 666(0x29a, float:9.33E-43)
            r7 = r10
            r9 = r10
            r10 = r10
            r13 = r10
            r18 = r10
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18)
            X.8kc r0 = r31.x3()
            com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar[] r0 = r0.LJLJI
            if (r0 == 0) goto L81
            java.util.List r22 = X.ORY.LJJZZIII(r0)
        L81:
            r29 = 1007(0x3ef, float:1.411E-42)
            r17 = r5
            r18 = r10
            r19 = r10
            r20 = r10
            r21 = r10
            r23 = r10
            r24 = r10
            r25 = r10
            r26 = r10
            r27 = r15
            r30 = r10
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r1 = com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct.copy$default(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30)
        L9d:
            java.lang.String r6 = "detail_page_shoot"
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.ui.assem.AddYoursDetailScaffoldAssem.v3(boolean):com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam");
    }
}
