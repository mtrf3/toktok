package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C64;
import X.C65385PlN;
import X.C65403Plf;
import X.EnumC65386PlO;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveLikeDegrade_OptTypeAdapter extends TypeAdapter<LiveLikeDegrade> {
    public final Gson LIZ;

    public LiveLikeDegrade_OptTypeAdapter(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveLikeDegrade read(C65385PlN reader) {
        o.LJIIIZ(reader, "reader");
        if (reader.LJJIJIL() == EnumC65386PlO.NULL) {
            return null;
        }
        LiveLikeDegrade liveLikeDegrade = new LiveLikeDegrade();
        reader.LIZIZ();
        while (reader.LJIIJJI()) {
            String LJJ = reader.LJJ();
            if (LJJ != null) {
                switch (LJJ.hashCode()) {
                    case -1265848843:
                        if (!LJJ.equals("enable_lottie_anim")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveLikeDegrade.enableLottieAnim = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -1113284370:
                        if (!LJJ.equals("enable_self_like")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveLikeDegrade.enableSelflike = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case -191171065:
                        if (!LJJ.equals("enable_easter_eggs")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveLikeDegrade.enableEasterEggs = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 555189154:
                        if (!LJJ.equals("enable_other_like")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveLikeDegrade.enableOtherlike = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                    case 1789132923:
                        if (!LJJ.equals("enable_avatar_anim")) {
                            break;
                        } else if (reader.LJJIJIL() != EnumC65386PlO.NULL) {
                            liveLikeDegrade.enableAvatarAnim = ((Boolean) C64.LIZ(this.LIZ, Boolean.TYPE, reader, "gson.getAdapter(Boolean::class.java).read(reader)")).booleanValue();
                            break;
                        } else {
                            reader.LJJIIJ();
                            break;
                        }
                }
            }
            reader.LJJJJ();
        }
        reader.LJFF();
        return liveLikeDegrade;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C65403Plf writer, LiveLikeDegrade liveLikeDegrade) {
        LiveLikeDegrade liveLikeDegrade2 = liveLikeDegrade;
        o.LJIIIZ(writer, "writer");
        if (liveLikeDegrade2 == null) {
            writer.LJIIJJI();
            return;
        }
        writer.LIZJ();
        writer.LJI("enable_self_like");
        writer.LJJIII(liveLikeDegrade2.enableSelflike);
        writer.LJI("enable_other_like");
        writer.LJJIII(liveLikeDegrade2.enableOtherlike);
        writer.LJI("enable_lottie_anim");
        writer.LJJIII(liveLikeDegrade2.enableLottieAnim);
        writer.LJI("enable_avatar_anim");
        writer.LJJIII(liveLikeDegrade2.enableAvatarAnim);
        writer.LJI("enable_easter_eggs");
        writer.LJJIII(liveLikeDegrade2.enableEasterEggs);
        writer.LJFF();
    }
}
