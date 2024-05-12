package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionModule$1$1", f = "EffectDraftSubmissionModule.kt", l = {73}, m = "invokeSuspend")
/* renamed from: X.2na, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69182na extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C793139j LJLILLLLZI;
    public final /* synthetic */ List<UploadableDraftEffect> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69182na(C793139j c793139j, List<UploadableDraftEffect> list, InterfaceC67352kd<? super C69182na> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c793139j;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69182na(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [X.3Xk] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C69192nb c69192nb;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            String str = this.LJLILLLLZI.LIZ.mStickerID;
            if (str == null) {
                str = "";
            }
            java.util.Set LLJJ = ORZ.LLJJ(s.LJLJJL(str, new String[]{","}, 0, 6));
            List<UploadableDraftEffect> list = this.LJLJI;
            ArrayList arrayList = new ArrayList();
            for (UploadableDraftEffect uploadableDraftEffect : list) {
                if (LLJJ.contains(uploadableDraftEffect.effectId)) {
                    arrayList.add(uploadableDraftEffect);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                UploadableDraftEffect uploadableDraftEffect2 = (UploadableDraftEffect) next;
                if (C69162nY.LIZ() || C44687HgJ.LIZIZ(uploadableDraftEffect2.unzipFilePath)) {
                    arrayList2.add(next);
                }
            }
            if (arrayList2.isEmpty()) {
                this.LJLILLLLZI.LIZIZ.setVisibility(8);
                return C76800UCe.LIZ;
            }
            EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel = this.LJLILLLLZI.LIZLLL;
            if (effectDraftSubmissionListViewModel != null) {
                this.LJLIL = 1;
                obj = XKX.LJI(C78613UtF.LIZJ, new C69132nV(arrayList2, effectDraftSubmissionListViewModel, null), this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                o.LJIJI("viewModel");
                throw null;
            }
        }
        List list2 = (List) obj;
        if (list2.isEmpty()) {
            this.LJLILLLLZI.LIZIZ.setVisibility(8);
            return C76800UCe.LIZ;
        }
        EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel2 = this.LJLILLLLZI.LIZLLL;
        if (effectDraftSubmissionListViewModel2 != null) {
            effectDraftSubmissionListViewModel2.LJLILLLLZI = 0;
            int size = list2.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                UploadableDraftEffect uploadableDraftEffect3 = (UploadableDraftEffect) ListProtector.get(list2, i2);
                if (uploadableDraftEffect3.enableSubmission) {
                    int i3 = effectDraftSubmissionListViewModel2.LJLILLLLZI;
                    if (i3 < 10) {
                        effectDraftSubmissionListViewModel2.LJLILLLLZI = i3 + 1;
                        c69192nb = new C69192nb(true, uploadableDraftEffect3);
                    } else {
                        c69192nb = new C69192nb(false, uploadableDraftEffect3);
                    }
                } else {
                    c69192nb = new C69192nb(false, uploadableDraftEffect3);
                }
                arrayList3.add(c69192nb);
            }
            effectDraftSubmissionListViewModel2.LJLIL.setValue(arrayList3);
            this.LJLILLLLZI.LIZIZ.LIZ(true);
            C793139j c793139j = this.LJLILLLLZI;
            final EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel3 = c793139j.LIZLLL;
            if (effectDraftSubmissionListViewModel3 != null) {
                final java.util.Map<String, String> map = c793139j.LJFF;
                c793139j.LIZJ = new AbstractC029409q<ViewOnClickListenerC85573Xl>(effectDraftSubmissionListViewModel3, map) { // from class: X.3Xk
                    public final EffectDraftSubmissionListViewModel LJLIL;
                    public final java.util.Map<String, String> LJLILLLLZI;

                    @Override // X.AbstractC029409q
                    public final int getItemCount() {
                        List<C69192nb> value = this.LJLIL.LJLIL.getValue();
                        if (value != null) {
                            return value.size();
                        }
                        return 0;
                    }

                    {
                        o.LJIIIZ(map, "mobData");
                        this.LJLIL = effectDraftSubmissionListViewModel3;
                        this.LJLILLLLZI = map;
                    }

                    @Override // X.AbstractC029409q
                    public final void onBindViewHolder(ViewOnClickListenerC85573Xl viewOnClickListenerC85573Xl, int i4) {
                        C69192nb c69192nb2;
                        float f;
                        ViewOnClickListenerC85573Xl holder = viewOnClickListenerC85573Xl;
                        o.LJIIIZ(holder, "holder");
                        List<C69192nb> value = this.LJLIL.LJLIL.getValue();
                        if (value != null && (c69192nb2 = (C69192nb) ListProtector.get(value, i4)) != null) {
                            java.util.Map<String, String> mobData = this.LJLILLLLZI;
                            o.LJIIIZ(mobData, "mobData");
                            holder.LJLJI = c69192nb2;
                            holder.LJLILLLLZI = mobData;
                            File file = new File(c69192nb2.LJLILLLLZI.iconFilePath);
                            holder.LJLJJL.setText(c69192nb2.LJLILLLLZI.effectName);
                            W5F LJI = W5U.LJI(file);
                            LJI.LJIJJ = EnumC72807Shn.FIT_CENTER;
                            LJI.LJJIIJ = holder.LJLJJLL;
                            C16880lQ.LLJJJ(LJI);
                            holder.LJLJJI.setChecked(c69192nb2.LJLIL);
                            View view = holder.itemView;
                            if (c69192nb2.LJLILLLLZI.enableSubmission) {
                                f = 1.0f;
                            } else {
                                f = 0.34f;
                            }
                            view.setAlpha(f);
                            holder.LJLJJI.setClickable(false);
                            C16880lQ.LJIIJ(holder, holder.itemView);
                        }
                    }

                    @Override // X.AbstractC029409q
                    /* renamed from: onCreateViewHolder */
                    public final ViewOnClickListenerC85573Xl com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i4) {
                        View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bbx, viewGroup, false);
                        EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel4 = this.LJLIL;
                        o.LJIIIIZZ(itemView, "itemView");
                        ViewOnClickListenerC85573Xl viewOnClickListenerC85573Xl = new ViewOnClickListenerC85573Xl(effectDraftSubmissionListViewModel4, itemView);
                        C0AX.LIZ(viewGroup, viewOnClickListenerC85573Xl.itemView, R.id.lj7);
                        View view = viewOnClickListenerC85573Xl.itemView;
                        if (view != null) {
                            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
                        }
                        try {
                            if (viewOnClickListenerC85573Xl.itemView.getParent() != null) {
                                boolean z = true;
                                try {
                                    SettingsManager.LIZLLL().getClass();
                                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                                } catch (Exception unused) {
                                }
                                if (z) {
                                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                    stringBuffer.append(ViewOnClickListenerC85573Xl.class.getName());
                                    stringBuffer.append(" parent ");
                                    stringBuffer.append(viewGroup.getClass().getName());
                                    stringBuffer.append(" viewType ");
                                    stringBuffer.append(i4);
                                    C78983UzD.LJIILL(stringBuffer.toString());
                                    ViewGroup viewGroup2 = (ViewGroup) viewOnClickListenerC85573Xl.itemView.getParent();
                                    if (viewGroup2 != null) {
                                        C16880lQ.LJLLL(viewOnClickListenerC85573Xl.itemView, viewGroup2);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            C78946Uyc.LIZIZ(e);
                            C36922EeM.LIZ(e);
                        }
                        C29127Bbv.LIZ = ViewOnClickListenerC85573Xl.class.getName();
                        return viewOnClickListenerC85573Xl;
                    }
                };
                C793139j c793139j2 = this.LJLILLLLZI;
                C85213Wb c85213Wb = c793139j2.LIZIZ;
                C85563Xk c85563Xk = c793139j2.LIZJ;
                if (c85563Xk != null) {
                    c85213Wb.getClass();
                    c85213Wb.getDraftSubmissionItemList().setAdapter(c85563Xk);
                    return C76800UCe.LIZ;
                }
                o.LJIJI("draftSubmissionAdapter");
                throw null;
            }
            o.LJIJI("viewModel");
            throw null;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
