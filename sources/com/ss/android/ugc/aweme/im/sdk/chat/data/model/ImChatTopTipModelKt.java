package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C32I;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ImChatTopTipModelKt {
    public static final SystemContent.Key toKey(IMActionTemplate iMActionTemplate) {
        int i;
        String str;
        o.LJIIIZ(iMActionTemplate, "<this>");
        SystemContent.Key key = new SystemContent.Key();
        Integer action = iMActionTemplate.getAction();
        if (action != null) {
            i = action.intValue();
        } else {
            i = -1;
        }
        key.setAction(i);
        Integer key2 = iMActionTemplate.getKey();
        if (key2 != null) {
            str = key2.toString();
        } else {
            str = null;
        }
        key.setKey(str);
        key.setName(iMActionTemplate.getName());
        key.setLink(iMActionTemplate.getLink());
        return key;
    }

    public static final SystemContent toSystemContent(IMNoticeMsgStruct iMNoticeMsgStruct) {
        String str;
        List<IMActionTemplate> template;
        o.LJIIIZ(iMNoticeMsgStruct, "<this>");
        SystemContent systemContent = new SystemContent();
        IMFromMessageTips msgContent = iMNoticeMsgStruct.getMsgContent();
        SystemContent.Key[] keyArr = null;
        if (msgContent != null) {
            str = msgContent.getTips();
        } else {
            str = null;
        }
        systemContent.setTips(str);
        IMFromMessageTips msgContent2 = iMNoticeMsgStruct.getMsgContent();
        if (msgContent2 != null && (template = msgContent2.getTemplate()) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(template, 10));
            Iterator<IMActionTemplate> it = template.iterator();
            while (it.hasNext()) {
                arrayList.add(toKey(it.next()));
            }
            keyArr = (SystemContent.Key[]) arrayList.toArray(new SystemContent.Key[0]);
        }
        systemContent.setTemplate(keyArr);
        return systemContent;
    }
}
