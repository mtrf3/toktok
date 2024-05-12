package com.ss.android.ugc.gamora.editor.sticker.nature.api;

import X.C164606d6;
import X.E8L;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.gamora.editor.sticker.nature.model.NatureSpeciesResponseBoolean;
import com.ss.android.ugc.gamora.editor.sticker.nature.model.NatureSpeciesResponseList;

/* loaded from: classes3.dex */
public interface NatureSpeciesListApi {
    public static final C164606d6 LIZ = C164606d6.LIZ;

    @E8M("/media/api/pic/nature/check")
    Object checkNatureContent(@InterfaceC195727mC CheckNatureContentReq checkNatureContentReq, InterfaceC67352kd<? super NatureSpeciesResponseBoolean> interfaceC67352kd);

    @E8L("/media/api/pic/nature/list")
    Object getNatureContent(@InterfaceC64986Pew("creation_id") String str, @InterfaceC64986Pew("tos_zip_path") String str2, InterfaceC67352kd<? super NatureSpeciesResponseList> interfaceC67352kd);
}
