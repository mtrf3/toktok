package X;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.BiO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C29528BiO extends FrameLayout {
    @Override // android.view.View
    public final void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
        try {
            super.restoreHierarchyState(sparseArray);
        } catch (Exception e) {
            JSONObject jSONObject = new JSONObject();
            C05630Jz.LJI(jSONObject, "error_msg", e.toString());
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            JSONObject jSONObject2 = new JSONObject();
            int i = 1;
            if (getId() != -1) {
                arrayList.add(Integer.valueOf(getId()));
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(C78609UtB.LJJJI(this), C78609UtB.LJJJIL(this, arrayList, hashSet));
                jSONObject2.put("view_info", jSONObject3);
                if (!C79004UzY.LJJIFFI(hashSet)) {
                    jSONObject2.put("repeat_id", TextUtils.join(", ", hashSet));
                }
            } catch (JSONException unused) {
            }
            C05630Jz.LIZJ("dump", jSONObject, jSONObject2);
            if (jSONObject2.optJSONObject("repeat_id") == null) {
                i = 0;
            }
            C0K2.LJIIIIZZ("ttlive_xg_restore_dump", i, jSONObject);
        }
    }

    public C29528BiO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
