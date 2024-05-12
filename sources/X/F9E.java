package X;

import java.util.Formatter;
import java.util.Objects;

/* loaded from: classes7.dex */
public abstract class F9E {
    public abstract Object[] getObjects();

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        Object[] objects = getObjects();
        int length = objects.length;
        StringBuilder sb = new StringBuilder(getClass().getName());
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                sb.append(":%s");
            } else {
                sb.append(",%s");
            }
        }
        return new Formatter().format(sb.toString(), objects).toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().isAssignableFrom(obj.getClass())) {
            Object[] objects = getObjects();
            Object[] objects2 = ((F9E) obj).getObjects();
            for (int i = 0; i < objects.length; i++) {
                Object obj2 = objects[i];
                if (obj2 == null) {
                    if (objects2[i] == null) {
                    }
                } else if (obj2.equals(objects2[i])) {
                }
            }
            return true;
        }
        return false;
    }
}
