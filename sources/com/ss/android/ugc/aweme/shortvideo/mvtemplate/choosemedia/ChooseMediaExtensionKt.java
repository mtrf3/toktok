package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.AbstractC45488HtE;
import X.AbstractC45594Huw;
import X.C162476Zf;
import X.C163726bg;
import X.C43045Guv;
import X.C43933HMb;
import X.C45569HuX;
import X.C45597Huz;
import X.C45598Hv0;
import X.C45599Hv1;
import X.C45674HwE;
import X.C73165SnZ;
import X.TBT;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ChooseMediaExtensionKt {
    public static final C45569HuX LIZ = new C45569HuX(0);

    public static final OpeningChooseMediaPageState LIZ(C45674HwE c45674HwE) {
        return ((ChooseMediaState) ((BaseJediViewModel) C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(c45674HwE), c45674HwE).LIZ(ChooseMediaViewModel.class)).Hv0(c45674HwE)).getOpeningChooseMediaPageState();
    }

    public static final void LIZIZ(C43933HMb c43933HMb, MediaModel mediaModel) {
        o.LJIIIZ(mediaModel, "mediaModel");
        C43045Guv.LIZIZ(new AqS154S0200000_7(c43933HMb, mediaModel, 35));
    }

    public static final void LIZJ(final AbstractC45488HtE abstractC45488HtE, final AbstractC45594Huw type) {
        o.LJIIIZ(abstractC45488HtE, "<this>");
        o.LJIIIZ(type, "type");
        abstractC45488HtE.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt$selectMediaList$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_START) {
                    onStart();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            public final void onStart() {
                TBT tbt;
                AbstractC45488HtE.this.getLifecycle().removeObserver(this);
                JediViewModel LIZ2 = C163726bg.LIZJ(AbstractC45488HtE.this.mView).LIZ(ChooseMediaViewModel.class);
                o.LJIIIIZZ(LIZ2, "of(view).get(ChooseMediaViewModel::class.java)");
                BaseJediViewModel baseJediViewModel = (BaseJediViewModel) LIZ2;
                AbstractC45488HtE abstractC45488HtE2 = AbstractC45488HtE.this;
                AbstractC45594Huw abstractC45594Huw = type;
                if (o.LJ(abstractC45594Huw, C45597Huz.LIZ)) {
                    tbt = new TBT() { // from class: X.Huh
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((ChooseMediaState) obj).getAllMediaList();
                        }
                    };
                } else if (o.LJ(abstractC45594Huw, C45598Hv0.LIZ)) {
                    tbt = new TBT() { // from class: X.Hui
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((ChooseMediaState) obj).getPhotoMediaList();
                        }
                    };
                } else if (o.LJ(abstractC45594Huw, C45599Hv1.LIZ)) {
                    tbt = new TBT() { // from class: X.Huj
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((ChooseMediaState) obj).getVideoMediaList();
                        }
                    };
                } else {
                    throw new C162476Zf();
                }
                baseJediViewModel.Iv0(abstractC45488HtE2, tbt, new C73165SnZ(), new AqS138S0200000_7(this, AbstractC45488HtE.this, 19));
            }
        });
    }
}
