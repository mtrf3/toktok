package com.ss.android.ugc.aweme.services.editeffect;

import X.C140315f1;
import X.C140395f9;
import X.C15280iq;
import X.C32I;
import X.C84418XBe;
import X.EnumC133695Mn;
import X.X1D;
import X.XCT;
import X.XDR;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.editeffect.FetchEffectState;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectAnchorInfo;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectReuseDetails;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditEffectAnchorManager {
    public static final Companion Companion = new Companion();
    public final MutableLiveData<FetchEffectState> _fetchState;
    public final List<EditEffectAnchorInfo> data;
    public boolean serverRenderingCompleted;
    public final LiveData<FetchEffectState> state;
    public final String subType;

    public final EnumC133695Mn getEditEffectStyleForAlbum() {
        List<EditEffectAnchorInfo> list = this.data;
        ArrayList arrayList = new ArrayList();
        for (EditEffectAnchorInfo editEffectAnchorInfo : list) {
            if (editEffectAnchorInfo.getEffectType() == EnumC133695Mn.EDIT_EFFECT_CLIENT) {
                arrayList.add(editEffectAnchorInfo);
            }
        }
        List<EditEffectAnchorInfo> list2 = this.data;
        ArrayList arrayList2 = new ArrayList();
        for (EditEffectAnchorInfo editEffectAnchorInfo2 : list2) {
            EditEffectAnchorInfo editEffectAnchorInfo3 = editEffectAnchorInfo2;
            if (editEffectAnchorInfo3.getEffectType() == EnumC133695Mn.EDIT_EFFECT_SERVER || editEffectAnchorInfo3.getEffectType() == EnumC133695Mn.EDIT_EFFECT_COMBINED) {
                arrayList2.add(editEffectAnchorInfo2);
            }
        }
        if (!arrayList.isEmpty()) {
            return EnumC133695Mn.EDIT_EFFECT_CLIENT;
        }
        if (!arrayList2.isEmpty()) {
            return EnumC133695Mn.EDIT_EFFECT_SERVER;
        }
        return null;
    }

    public final boolean hasOverlayEffects() {
        for (EditEffectAnchorInfo editEffectAnchorInfo : this.data) {
            List<EditEffectAnchorInfo> list = this.data;
            ArrayList arrayList = new ArrayList();
            for (EditEffectAnchorInfo editEffectAnchorInfo2 : list) {
                if (true ^ o.LJ(editEffectAnchorInfo.getEffectId(), editEffectAnchorInfo2.getEffectId())) {
                    arrayList.add(editEffectAnchorInfo2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                for (EditEffectReuseDetails editEffectReuseDetails : ((EditEffectAnchorInfo) it.next()).getDetails()) {
                    Iterator<EditEffectReuseDetails> it2 = editEffectAnchorInfo.getDetails().iterator();
                    while (it2.hasNext()) {
                        if (hasOverlayEffect(it2.next(), editEffectReuseDetails)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean hasServerRenderingEffect() {
        for (EditEffectAnchorInfo editEffectAnchorInfo : this.data) {
            if (editEffectAnchorInfo.getEffectType() == EnumC133695Mn.EDIT_EFFECT_SERVER || editEffectAnchorInfo.getEffectType() == EnumC133695Mn.EDIT_EFFECT_COMBINED) {
                return true;
            }
        }
        return false;
    }

    public final boolean isEditEffect() {
        return o.LJ(this.subType, EnumC133695Mn.EDIT_EFFECT.getType());
    }

    public final boolean isEditProp() {
        return o.LJ(this.subType, EnumC133695Mn.EDIT_PROP.getType());
    }

    public final boolean isReduceEditingEffectStepFlow() {
        if (o.LJ(this.subType, "template") || ((C140315f1.LIZ && (o.LJ(this.subType, EnumC133695Mn.EDIT_EFFECT.getType()) || o.LJ(this.subType, EnumC133695Mn.EDIT_EFFECT_SERVER.getType()) || o.LJ(this.subType, EnumC133695Mn.EDIT_EFFECT_CLIENT.getType()))) || (C140395f9.LIZ && o.LJ(this.subType, EnumC133695Mn.EDIT_PROP.getType())))) {
            return true;
        }
        return false;
    }

    public final boolean isTemplate() {
        return o.LJ(this.subType, "template");
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final List<EditEffectAnchorInfo> getData() {
        return this.data;
    }

    public final boolean getServerRenderingCompleted() {
        return this.serverRenderingCompleted;
    }

    public final LiveData<FetchEffectState> getState() {
        return this.state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void downloadEffects(XCT xct) {
        List<EditEffectAnchorInfo> list = this.data;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<EditEffectAnchorInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getEffectId());
        }
        this._fetchState.postValue(FetchEffectState.LOADING.INSTANCE);
        if (xct != 0) {
            xct.LJ(arrayList, true, null, new XDR<List<? extends Effect>>() { // from class: com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager$downloadEffects$1
                @Override // X.XDR
                public void preProcess(List<? extends Effect> list2) {
                }

                @Override // X.XDR
                public void onSuccess(List<? extends Effect> response) {
                    EditEffectAnchorInfo editEffectAnchorInfo;
                    o.LJIIIZ(response, "response");
                    C15280iq.LIZIZ("EditEffectAnchorManager", "success dowloaded effect");
                    for (Effect effect : response) {
                        Iterator<EditEffectAnchorInfo> it2 = EditEffectAnchorManager.this.getData().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                editEffectAnchorInfo = it2.next();
                                if (o.LJ(effect.getEffect_id(), editEffectAnchorInfo.getEffectId())) {
                                    break;
                                }
                            } else {
                                editEffectAnchorInfo = null;
                                break;
                            }
                        }
                        EditEffectAnchorInfo editEffectAnchorInfo2 = editEffectAnchorInfo;
                        if (editEffectAnchorInfo2 != null) {
                            C15280iq.LIZIZ("EditEffectAnchorManager", "set effect successful");
                            editEffectAnchorInfo2.setEffect(effect);
                        }
                    }
                    EditEffectAnchorManager editEffectAnchorManager = EditEffectAnchorManager.this;
                    editEffectAnchorManager._fetchState.postValue(new FetchEffectState.SUCCESS(editEffectAnchorManager.getData()));
                }

                @Override // X.XDR
                public void onFail(List<? extends Effect> list2, C84418XBe exception) {
                    o.LJIIIZ(exception, "exception");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("failed to download effect list ");
                    LIZ.append(exception.LIZ);
                    LIZ.append(" :: ");
                    LIZ.append(exception.LIZIZ);
                    C15280iq.LIZJ("EditEffectAnchorManager", X1D.LIZIZ(LIZ));
                    EditEffectAnchorManager.this._fetchState.postValue(new FetchEffectState.ERROR(exception.LIZ, exception.LIZIZ));
                }
            });
        }
    }

    public final void setEffect(Effect effect) {
        o.LJIIIZ(effect, "effect");
        if (this.data.size() == 1 && o.LJ(((EditEffectAnchorInfo) ListProtector.get(this.data, 0)).getEffectId(), effect.getEffect_id())) {
            ((EditEffectAnchorInfo) ListProtector.get(this.data, 0)).setEffect(effect);
            this._fetchState.postValue(new FetchEffectState.SUCCESS(this.data));
        }
    }

    public final void setServerRenderingCompleted(boolean z) {
        this.serverRenderingCompleted = z;
    }

    public EditEffectAnchorManager(List<EditEffectAnchorInfo> data, String subType) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(subType, "subType");
        this.data = data;
        this.subType = subType;
        MutableLiveData<FetchEffectState> mutableLiveData = new MutableLiveData<>(FetchEffectState.INIT.INSTANCE);
        this._fetchState = mutableLiveData;
        this.state = mutableLiveData;
    }

    private final boolean hasOverlayEffect(EditEffectReuseDetails editEffectReuseDetails, EditEffectReuseDetails editEffectReuseDetails2) {
        if (editEffectReuseDetails2.getEndTime() > editEffectReuseDetails.getStartTime() && editEffectReuseDetails2.getStartTime() < editEffectReuseDetails.getEndTime()) {
            return true;
        }
        return false;
    }
}
