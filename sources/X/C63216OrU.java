package X;

import Y.ARunnableS29S0200000_10;
import Y.IDcS134S0200000_10;
import android.text.TextUtils;
import com.bytedance.im.core.proto.ModifyMessagePropertyResponseBody;
import com.bytedance.im.core.proto.ModifyPropertyContent;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.OrU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63216OrU extends AbstractC63515OwJ<C63219OrX> {
    public C63216OrU() {
        super(EnumC63625Oy5.SET_MESSAGE_PROPERTY.getValue());
    }

    public C63216OrU(C80363Dk c80363Dk) {
        super(EnumC63625Oy5.SET_MESSAGE_PROPERTY.getValue(), c80363Dk);
    }

    public static List LJIILIIL(C63219OrX c63219OrX) {
        List<ModifyPropertyContent> propertyContentList;
        if (c63219OrX == null || (propertyContentList = c63219OrX.getPropertyContentList()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ModifyPropertyContent modifyPropertyContent : propertyContentList) {
            if (modifyPropertyContent.operation != null) {
                C32H c32h = new C32H();
                c32h.msgUuid = c63219OrX.getClientMessageId();
                c32h.conversationId = c63219OrX.getConversationId();
                c32h.uid = Long.valueOf(C63308Osy.LJI().LIZIZ().getUid());
                c32h.sec_uid = C63308Osy.LJI().LIZIZ().getSecUid();
                c32h.idempotent_id = modifyPropertyContent.idempotent_id;
                c32h.key = modifyPropertyContent.key;
                c32h.value = modifyPropertyContent.value;
                c32h.status = 1;
                c32h.create_time = Long.valueOf(System.currentTimeMillis());
                c32h.create_time_v2 = Long.valueOf(System.currentTimeMillis() * 1000);
                if (modifyPropertyContent.operation.getValue() == EnumC63258OsA.ADD_PROPERTY_ITEM.getValue()) {
                    c32h.deleted = 0;
                } else if (modifyPropertyContent.operation.getValue() == EnumC63258OsA.REMOVE_PROPERTY_ITEM.getValue()) {
                    c32h.deleted = 1;
                }
                arrayList.add(c32h);
            }
        }
        return arrayList;
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        Response response;
        ResponseBody responseBody;
        ModifyMessagePropertyResponseBody modifyMessagePropertyResponseBody;
        if (c63622Oy2 == null || !c63622Oy2.LJIIJ() || (response = c63622Oy2.LJLJL) == null || (responseBody = response.body) == null || (modifyMessagePropertyResponseBody = responseBody.modify_message_property_body) == null) {
            return false;
        }
        EnumC63233Orl enumC63233Orl = modifyMessagePropertyResponseBody.status;
        if (enumC63233Orl != EnumC63233Orl.MODIFY_PROPERTY_SUCCESS && enumC63233Orl != EnumC63233Orl.MODIFY_PROPERTY_REPEAT_REQUEST) {
            return false;
        }
        return true;
    }

    public final void LJIILL(C63219OrX c63219OrX) {
        if (c63219OrX.invalid()) {
            if (c63219OrX.getMute()) {
                return;
            }
            LIZIZ(C63622Oy2.LIZJ(-1015));
            C63309Osz LIZLLL = C63309Osz.LIZLLL();
            LIZLLL.getClass();
            if (TextUtils.isEmpty(c63219OrX.getConversationId())) {
                return;
            }
            LIZLLL.LIZJ(c63219OrX.getConversationId(), new C63248Os0(-1015, c63219OrX));
            return;
        }
        c63219OrX.setMsgType(EnumC63179Oqt.MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY.getValue());
        RunnableC63345OtZ.LJ(new IDcS134S0200000_10(this, c63219OrX, 15), null, false);
    }

    public static void LJIILJJIL(Collection collection, boolean z) {
        C63323OtD LIZJ = C63144OqK.LIZJ("im_resend_msg_property");
        LIZJ.LIZ(Integer.valueOf(collection.size()), "property_count");
        LIZJ.LIZ(Boolean.valueOf(z), "property_for_single_message");
        LIZJ.LIZLLL();
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        C63219OrX c63219OrX;
        Object[] objArr = c63622Oy2.LJLJJL;
        if (objArr == null || (c63219OrX = (C63219OrX) objArr[0]) == null) {
            return;
        }
        boolean LJIIIZ = LJIIIZ(c63622Oy2);
        RunnableC63345OtZ.LIZLLL(new C63215OrT(this, c63622Oy2, c63219OrX, LJIIIZ), new C63218OrW(this, c63622Oy2, c63219OrX, LJIIIZ), C63346Ota.LIZIZ());
    }
}
