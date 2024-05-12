package X;

import android.text.TextUtils;
import com.bytedance.android.live.effect.api.EffectRelatedApi;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.EffectManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0ja, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15740ja {
    public static final C43201mm LIZ = new C1MZ() { // from class: X.1mm
        public static final C33771Uf LIZLLL = C15750jb.LIZ;
        public List<FilterModel> LIZ = LIZLLL.LIZ;
        public C1QB LIZIZ = new C1QB();
        public InterfaceC30359Bvn LIZJ;

        @Override // X.C1MZ
        public final String LIZJ() {
            if (this.LIZ.isEmpty()) {
                return "";
            }
            return ((LiveEffect) ListProtector.get(this.LIZ, LJIIIZ())).getName();
        }

        @Override // X.C1MZ
        public final void LIZLLL() {
            EffectManager effectManager;
            if (((ArrayList) this.LIZ).isEmpty()) {
                return;
            }
            int LJIIIZ = LJIIIZ();
            int LJIIJ = LJIIJ(LJIIIZ, 1);
            FilterModel filterModel = (FilterModel) ListProtector.get(this.LIZ, LJIIJ);
            C33771Uf c33771Uf = LIZLLL;
            if (!C33771Uf.LJIIJJI(filterModel)) {
                c33771Uf.getClass();
                if (filterModel.getFilterType() != 2 || (effectManager = c33771Uf.LIZIZ) == null || !effectManager.isEffectDownloading(filterModel.getEffect())) {
                    c33771Uf.LJIIIIZZ(filterModel);
                    return;
                }
                return;
            }
            C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLZZLLIL;
            if (!c48459J0d.LIZJ().booleanValue()) {
                c48459J0d.LIZ(Boolean.TRUE);
            }
            c33771Uf.getClass();
            LJIIJJI(LJIIIZ, LJIIJ);
        }

        @Override // X.C1MZ
        public final void LJ() {
            EffectManager effectManager;
            if (((ArrayList) this.LIZ).isEmpty()) {
                return;
            }
            int LJIIIZ = LJIIIZ();
            int LJIIJ = LJIIJ(LJIIIZ, 2);
            FilterModel filterModel = (FilterModel) ListProtector.get(this.LIZ, LJIIJ);
            C33771Uf c33771Uf = LIZLLL;
            if (!C33771Uf.LJIIJJI(filterModel)) {
                c33771Uf.getClass();
                if (filterModel.getFilterType() != 2 || (effectManager = c33771Uf.LIZIZ) == null || !effectManager.isEffectDownloading(filterModel.getEffect())) {
                    c33771Uf.LJIIIIZZ(filterModel);
                    return;
                }
                return;
            }
            C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLZZLLIL;
            if (!c48459J0d.LIZJ().booleanValue()) {
                c48459J0d.LIZ(Boolean.TRUE);
            }
            c33771Uf.getClass();
            LJIIJJI(LJIIIZ, LJIIJ);
        }

        @Override // X.C1MZ
        public final int LJIIIZ() {
            int intValue = InterfaceC30442Bx8.LJIJI.LIZJ().intValue();
            if (intValue >= this.LIZ.size() || intValue < 0) {
                return 0;
            }
            return intValue;
        }

        @Override // X.C1MZ
        public final void release() {
            LIZLLL.LIZLLL(this);
            C1QB c1qb = this.LIZIZ;
            if (c1qb != null) {
                c1qb.LIZ = null;
            }
        }

        @Override // X.C1MZ
        public final void LIZ(long j) {
            String str;
            int intValue = InterfaceC30442Bx8.LJIJI.LIZJ().intValue();
            C33771Uf c33771Uf = LIZLLL;
            if (intValue >= ((ArrayList) c33771Uf.LIZ).size()) {
                return;
            }
            if (!C79004UzY.LJJIFFI(c33771Uf.LIZ) && intValue < ((ArrayList) c33771Uf.LIZ).size() && ListProtector.get(c33771Uf.LIZ, intValue) != null) {
                str = ((LiveEffect) ListProtector.get(c33771Uf.LIZ, intValue)).getName();
            } else {
                str = "";
            }
            ((EffectRelatedApi) C1A.LIZJ(EffectRelatedApi.class)).uploadBeautyParams(j, str, (int) (InterfaceC30442Bx8.LJJI.LIZJ().floatValue() * 100.0f), (int) (InterfaceC30442Bx8.LJJIFFI.LIZJ().floatValue() * 100.0f), (int) (InterfaceC30442Bx8.LJJII.LIZJ().floatValue() * 100.0f), (int) (InterfaceC30442Bx8.LJJIII.LIZJ().floatValue() * 100.0f), false).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.1UW
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                }
            }, new InterfaceC64592gB() { // from class: X.1UX
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    C0NB.LJIIJ(6, "LiveFilterHelper", ((Throwable) obj).getStackTrace());
                }
            });
        }

        @Override // X.InterfaceC08060Ti
        public final void LIZIZ(boolean z) {
            if (z) {
                List<FilterModel> list = LIZLLL.LIZ;
                this.LIZ = list;
                if (!C79004UzY.LJJIFFI(list)) {
                    C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LJIJI;
                    if (c48459J0d.LIZJ().intValue() > 0 && c48459J0d.LIZJ().intValue() < ((ArrayList) this.LIZ).size() && this.LIZIZ != null) {
                        C12890ez.LIZ().LJIILIIL();
                    }
                }
            }
        }

        @Override // X.C1MZ
        public final void LJFF(C1QB c1qb) {
            FilterModel filterModel;
            LIZLLL.LIZIZ(this);
            if (c1qb != null) {
                this.LIZIZ = c1qb;
            }
            int LJIIIZ = LJIIIZ();
            if (LJIIIZ <= 0 || LJIIIZ >= ((ArrayList) this.LIZ).size()) {
                filterModel = null;
            } else {
                filterModel = (FilterModel) ListProtector.get(this.LIZ, LJIIIZ);
            }
            LJIIL(filterModel);
        }

        @Override // X.C1MZ
        public final void LJI(int i) {
            EffectManager effectManager;
            int LJIIIZ = LJIIIZ();
            if (i < 0 || i >= ((ArrayList) this.LIZ).size()) {
                return;
            }
            C33771Uf c33771Uf = LIZLLL;
            if (!C33771Uf.LJIIJJI((LiveEffect) ListProtector.get(this.LIZ, i))) {
                FilterModel filterModel = (FilterModel) ListProtector.get(this.LIZ, i);
                c33771Uf.getClass();
                if (filterModel.getFilterType() != 2 || (effectManager = c33771Uf.LIZIZ) == null || !effectManager.isEffectDownloading(filterModel.getEffect())) {
                    c33771Uf.LJIIIIZZ((LiveEffect) ListProtector.get(this.LIZ, i));
                    return;
                }
                return;
            }
            LJIIJJI(LJIIIZ, i);
        }

        @Override // X.C1MZ
        public final void LJIIIIZZ(InterfaceC30359Bvn interfaceC30359Bvn) {
            this.LIZJ = interfaceC30359Bvn;
        }

        public final void LJIIL(FilterModel filterModel) {
            if (filterModel != null) {
                if (TextUtils.isEmpty(filterModel.getFilterPath())) {
                    C1QB c1qb = this.LIZIZ;
                    if (c1qb != null) {
                        c1qb.LJJIIZI();
                        return;
                    }
                    return;
                }
                if (C29306Beo.LJJI() && this.LIZJ != null && !LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
                    InterfaceC30359Bvn interfaceC30359Bvn = this.LIZJ;
                    String filterPath = filterModel.getFilterPath();
                    C33771Uf c33771Uf = LIZLLL;
                    c33771Uf.getClass();
                    interfaceC30359Bvn.setFilter(filterPath, c33771Uf.LJIIIZ(filterModel));
                    return;
                }
                C1QB c1qb2 = this.LIZIZ;
                if (c1qb2 == null) {
                    return;
                }
                String filterPath2 = filterModel.getFilterPath();
                C33771Uf c33771Uf2 = LIZLLL;
                c33771Uf2.getClass();
                c1qb2.LJJIJ(c33771Uf2.LJIIIZ(filterModel), filterPath2);
            }
        }

        @Override // X.C1MZ
        public final void LJII(LiveEffect liveEffect, float f) {
            C1QB c1qb = this.LIZIZ;
            if (c1qb != null) {
                c1qb.LJJIJ(f, liveEffect.getFilterPath());
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
        
            r5 = r5 - 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int LJIIJ(int r5, int r6) {
            /*
                r4 = this;
                boolean r0 = X.C29306Beo.LJJI()
                r3 = 0
                r2 = 1
                if (r0 == 0) goto L43
                com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting.INSTANCE
                boolean r0 = r0.isComposerSupported()
                if (r0 != 0) goto L43
                boolean r0 = X.C15380j0.LJIIZILJ()
                if (r0 == 0) goto L3e
                if (r6 != r2) goto L40
            L18:
                int r5 = r5 + 1
            L1a:
                com.bytedance.android.livesdk.livesetting.effect.LiveAndroidCycleThroughFiltersSetting r0 = com.bytedance.android.livesdk.livesetting.effect.LiveAndroidCycleThroughFiltersSetting.INSTANCE
                boolean r1 = r0.isEnabled()
                if (r5 >= 0) goto L2c
                if (r1 == 0) goto L42
                java.util.List<com.bytedance.android.live.effect.model.FilterModel> r0 = r4.LIZ
                int r0 = r0.size()
            L2a:
                int r0 = r0 - r2
                return r0
            L2c:
                java.util.List<com.bytedance.android.live.effect.model.FilterModel> r0 = r4.LIZ
                int r0 = r0.size()
                if (r5 < r0) goto L5d
                if (r1 == 0) goto L37
                return r3
            L37:
                java.util.List<com.bytedance.android.live.effect.model.FilterModel> r0 = r4.LIZ
                int r0 = r0.size()
                goto L2a
            L3e:
                if (r6 != r2) goto L18
            L40:
                int r5 = r5 - r2
                goto L1a
            L42:
                return r3
            L43:
                if (r6 != r2) goto L52
                int r3 = r5 + (-1)
                if (r3 >= 0) goto L51
                java.util.List<com.bytedance.android.live.effect.model.FilterModel> r0 = r4.LIZ
                int r0 = r0.size()
                int r3 = r0 + (-1)
            L51:
                return r3
            L52:
                int r5 = r5 + 1
                java.util.List<com.bytedance.android.live.effect.model.FilterModel> r0 = r4.LIZ
                int r0 = r0.size()
                if (r5 < r0) goto L5d
                goto L51
            L5d:
                r3 = r5
                goto L51
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C43201mm.LJIIJ(int, int):int");
        }

        public final void LJIIJJI(int i, int i2) {
            String str;
            if (i >= ((ArrayList) this.LIZ).size() || i2 >= ((ArrayList) this.LIZ).size()) {
                return;
            }
            C15750jb.LIZ.LJFF(i2);
            C73943T0h.LIZ().LIZIZ(new C11050c1());
            if (LJIIIZ() == 0 || ((ArrayList) this.LIZ).isEmpty()) {
                str = "";
            } else {
                str = ((LiveEffect) ListProtector.get(this.LIZ, LJIIIZ())).getFilterPath();
            }
            if (i2 == 0) {
                if (C29306Beo.LJJI() && this.LIZJ != null && !LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
                    C0NB.LIZIZ("LiveFilterHelper", "liveParamsListener unset");
                    this.LIZJ.setFilter("", 1.0f);
                    return;
                } else {
                    if (this.LIZIZ == null) {
                        return;
                    }
                    C0NB.LIZIZ("LiveFilterHelper", "FilterEffect unset");
                    this.LIZIZ.LJJIIZI();
                    return;
                }
            }
            C279017q.LJ("FilterEffect update file:", str, "LiveFilterHelper");
            LJIIL((FilterModel) ListProtector.get(this.LIZ, LJIIIZ()));
        }
    };
}
