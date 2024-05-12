package X;

import Y.ARunnableS29S0200000_10;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.im.core.proto.CreateConversationV2RequestBody;
import com.bytedance.im.core.proto.CreateConversationV2ResponseBody;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.List;
import java.util.UUID;

/* renamed from: X.Ox1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63559Ox1 extends AbstractC63515OwJ<C63120Opw> {
    public final C63569OxB LIZJ;
    public C116934iP LIZLLL;

    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return !C63308Osy.LJI().LIZLLL().LJJLL;
    }

    public C63559Ox1(InterfaceC86963bA<C63120Opw> interfaceC86963bA) {
        super(EnumC63625Oy5.CREATE_CONVERSATION_V2.getValue(), interfaceC86963bA);
        this.LIZJ = new C63569OxB();
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        CreateConversationV2ResponseBody createConversationV2ResponseBody;
        Integer num;
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && (createConversationV2ResponseBody = responseBody.create_conversation_v2_body) != null && (num = createConversationV2ResponseBody.status) != null && num.intValue() == EnumC63567Ox9.OP_SUCCEED.getValue() && c63622Oy2.LJLJL.body.create_conversation_v2_body.conversation != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        C116934iP c116934iP = this.LIZLLL;
        if (c116934iP != null) {
            c116934iP.LIZJ = SystemClock.elapsedRealtime();
        }
        this.LIZJ.LIZJ = SystemClock.uptimeMillis();
        C63569OxB c63569OxB = this.LIZJ;
        c63569OxB.LIZLLL = c63569OxB.LIZJ - this.LIZJ.LIZIZ;
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            CreateConversationV2ResponseBody createConversationV2ResponseBody = c63622Oy2.LJLJL.body.create_conversation_v2_body;
            RunnableC63345OtZ.LJ(new C63307Osx(this, createConversationV2ResponseBody, c63622Oy2), new C63558Ox0(this, c63622Oy2, aRunnableS29S0200000_10, createConversationV2ResponseBody), false);
            return;
        }
        LIZIZ(c63622Oy2);
        aRunnableS29S0200000_10.run();
        C63337OtR.LJII(c63622Oy2, false).LIZ();
        this.LIZJ.LJIIJ = SystemClock.uptimeMillis() - this.LIZJ.LIZ;
        C63323OtD LIZJ = C63144OqK.LIZJ("imsdk_create_conversation");
        LIZJ.LIZ(Long.valueOf(this.LIZJ.LIZLLL), "network_time");
        LIZJ.LIZ(Long.valueOf(this.LIZJ.LJIIJ), "whole_time");
        LIZJ.LIZ(Integer.valueOf(this.LIZJ.LJIIJJI), "conversation_type");
        LIZJ.LIZ("1", "is_success");
        LIZJ.LIZLLL();
        C116934iP c116934iP2 = this.LIZLLL;
        if (c116934iP2 == null) {
            return;
        }
        c116934iP2.LIZLLL = SystemClock.elapsedRealtime();
        this.LIZLLL.LIZ(false);
    }

    public final void LJIILIIL(int i, int i2, List list, java.util.Map map) {
        String uuid;
        CreateConversationV2RequestBody build;
        if (i2 == AbstractC63505Ow9.LIZIZ) {
            C116934iP c116934iP = new C116934iP("imsdk_group_chat_create");
            this.LIZLLL = c116934iP;
            c116934iP.LIZIZ = SystemClock.elapsedRealtime();
        }
        this.LIZJ.LIZ = SystemClock.uptimeMillis();
        this.LIZJ.LJIIJJI = i2;
        if (list.contains(-1L)) {
            LIZIZ(C63622Oy2.LIZJ(-1015));
            return;
        }
        C63561Ox3 c63561Ox3 = new C63561Ox3();
        c63561Ox3.LIZLLL = Integer.valueOf(i2);
        C63685Oz3.LIZ(list);
        c63561Ox3.LJ = list;
        if (map != null) {
            C63685Oz3.LIZIZ(map);
            c63561Ox3.LJIIJ = map;
        }
        if (!TextUtils.isEmpty(null)) {
            c63561Ox3.LJII = null;
        }
        if (!TextUtils.isEmpty(null)) {
            c63561Ox3.LJIIIIZZ = null;
        }
        if (!TextUtils.isEmpty(null)) {
            c63561Ox3.LJIIIZ = null;
        }
        if (i2 == AbstractC63505Ow9.LIZ) {
            build = c63561Ox3.build();
        } else {
            boolean z = !TextUtils.isEmpty(null);
            c63561Ox3.LJFF = Boolean.valueOf(z);
            if (z) {
                uuid = null;
            } else {
                uuid = UUID.randomUUID().toString();
            }
            c63561Ox3.LJI = uuid;
            build = c63561Ox3.build();
        }
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJIJI = build;
        RequestBody build2 = c89453Z8v.build();
        this.LIZJ.LIZIZ = SystemClock.uptimeMillis();
        LJIIJJI(i, build2, null, new Object[0]);
    }
}
