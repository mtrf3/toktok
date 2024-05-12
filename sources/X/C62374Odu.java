package X;

import android.os.Parcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import kotlin.jvm.internal.o;

/* renamed from: X.Odu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C62374Odu extends C62373Odt {
    public SendMessageTemplateTask LJIIIIZZ;

    @Override // X.C62373Odt
    public final /* bridge */ /* synthetic */ C62373Odt LIZ(Parcel parcel) {
        throw null;
    }

    public final void LIZJ(String id) {
        o.LJIIIZ(id, "id");
        this.LIZIZ = id;
    }

    public final void LIZLLL(Parcel source) {
        o.LJIIIZ(source, "source");
        super.LIZ(source);
        this.LJIIIIZZ = (SendMessageTemplateTask) source.readParcelable(SendMessageTemplateTask.class.getClassLoader());
    }

    public final void LJ(String title) {
        o.LJIIIZ(title, "title");
        this.LIZLLL = title;
    }

    public final void LIZIZ(String str, String value) {
        o.LJIIIZ(value, "value");
        this.LJII.putString(str, value);
    }
}
