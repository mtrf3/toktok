package com.ss.android.ugc.aweme.comment.commentlist.managementv2;

import X.C16880lQ;
import X.C175766v6;
import X.C175886vI;
import X.C42625Go9;
import X.C56642Ke;
import X.C76732zl;
import X.InterfaceC175676ux;
import X.QD3;
import X.TBV;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS28S0001000_3;
import kotlin.jvm.internal.AqS49S0400000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class CommentManagementAssemVM extends AssemViewModel<C175886vI> {
    public static final /* synthetic */ int LJLJJI = 0;
    public final Map<String, Comment> LJLIL = new HashMap();
    public final Map<String, Comment> LJLILLLLZI = new HashMap();
    public int LJLJI;

    public final void gv0() {
        this.LJLJI = 0;
        ((HashMap) this.LJLIL).clear();
        ((HashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C175886vI defaultState() {
        return new C175886vI(0);
    }

    public final boolean iv0() {
        return getVmDispatcher().getState().LJLILLLLZI.LIZ.booleanValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C42625Go9.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C42625Go9.LIZIZ(this);
    }

    public final boolean hv0(Comment comment) {
        String cid;
        if (comment == null || (cid = comment.getCid()) == null) {
            return false;
        }
        return ((HashMap) this.LJLIL).containsKey(cid);
    }

    public final void kv0(int i) {
        setState(new AqS28S0001000_3(i, 8));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onReportCommentEvent(C56642Ke event) {
        o.LJIIIZ(event, "event");
        try {
            if (TextUtils.equals("commentBatchReportResult", JSONObjectProtectorUtils.getString(event.LJLIL, "eventName"))) {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(JSONObjectProtectorUtils.getJSONObject(event.LJLIL, "data"), "object_ids");
                if (jSONArray == null) {
                    setState(C175766v6.LJLIL);
                    return;
                }
                HashSet hashSet = new HashSet();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = JSONArrayProtectorUtils.getString(jSONArray, i);
                    o.LJIIIIZZ(string, "objectIds.getString(i)");
                    hashSet.add(string);
                }
                Map<String, Comment> map = this.LJLIL;
                Map<String, Comment> map2 = this.LJLILLLLZI;
                C76732zl c76732zl = new C76732zl();
                c76732zl.element = this.LJLJI;
                HashMap hashMap = (HashMap) map2;
                if (hashMap.size() > 0 && c76732zl.element > 0) {
                    if (hashMap.size() == hashSet.size()) {
                        setState(new AqS49S0400000_3((Set) hashSet, (Set<String>) hashMap, (Map<String, ? extends Comment>) map, (Map<String, ? extends Comment>) c76732zl, (C76732zl) 0));
                        return;
                    }
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (!hashSet.contains(entry.getKey())) {
                            c76732zl.element -= ((int) ((Comment) entry.getValue()).getReplyCommentTotal()) + 1;
                        }
                    }
                    setState(new AqS49S0400000_3((Set) hashSet, (Set<String>) hashMap, (Map<String, ? extends Comment>) map, (Map<String, ? extends Comment>) c76732zl, (C76732zl) 1));
                }
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void jv0(LifecycleOwner lifecycleOwner, InterfaceC175676ux observer) {
        o.LJIIIZ(observer, "observer");
        AssemViewModel.selectSubscribe$default(this, new TBV() { // from class: X.6vF
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((C175886vI) obj).LJLILLLLZI;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                C175886vI c175886vI = (C175886vI) obj;
                C43I<Boolean> c43i = (C43I) obj2;
                c175886vI.getClass();
                o.LJIIIZ(c43i, "<set-?>");
                c175886vI.LJLILLLLZI = c43i;
            }
        }, null, lifecycleOwner, null, new AqS169S0100000_3(observer, 64), 10, null);
    }
}
